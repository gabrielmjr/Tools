# Tools

Tools is a pack of useful tools made by and for Java created and developed by me.

# Info

***Project type:*** Maven with Java

***Package:*** com.gabrielMJr.twaire.tools

***Tests:*** JUnit 

***Latest Release:*** 1.0.2

# FAQ
***How to convert String, Integer and Float values for the respective Arrays?***

***R:***

***1.*** First you need to have the jar file in your project, this step is necessary to use the package in your project, I still don't have support for gradle and maven dependencies. You can directly download the latest version by clicking [here](https://github.com/gabrielmjr/Tools/releases/download/1.0.2/Tools-1.0.2.jar) or you can check the [version history](https://github.com/gabrielmjr/Tools/releases)

***2.*** Another step you need to take to be able to use it is to import ***Tools*** in your class. 
To import it, use the line of code below:

    import com.gabrielMJr.twaire.tools.Tools;

***3.*** You need to create a new object as shown below:

    public class YourClass
    {
        Tools tools = new Tools();
    }


***Note:*** _The first, second and third step are required to use any other method._

***4.*** After that it's almost done, just follow the code steps below.

    public void your_method()
    {
        // To String type
       String[] my_list_string = tools.listOnValueOf("Your String");

        // To Integer type
        int[] my_list_integer = tools.listOnValueOf(123456789);

        // To Long type
        Long[] my_long_list = tools.listOnValueOf(/*Your long value*/);
    }

***Note2:*** _These methods convert each digit into a member of the list. For example, for the String_ `"testing"` _, the result will be_ `{"t","e","s","t","I","n","g"}` _, for the Integer_ `82839` , _the return will be_ `{8,2,8,3,9}` .
