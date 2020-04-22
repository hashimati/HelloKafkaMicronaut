package io.hashimati.testkafka;

/**
 * @author Ahmed Al Hashmi. 
 */
import javax.inject.Inject;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/api")
public class MessageController {
    @Inject
    private MessageClient messageClient; 


    @Get("test")
    public Message test()
    {
        return submitMessage(new Message(){{
            setName("Ahmed");
            setMessage("Hello World");
         }}); 
    }
    @Post("submit")
    public Message submitMessage(@Body Message message)
    {
        try{
            messageClient.send(message);
            return new Message(){{
                setName("System");
                setMessage("The Message is Successfully Received!");
            }}; 
        }
        catch(Exception ex)
        {
            return new Message(){{
                setName("System");
                setMessage("The Message is not Received!");
            }}; 
        }
    }
}