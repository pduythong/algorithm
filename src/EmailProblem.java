import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Problem - 1. Every email consists of a local name and a domain name, separated by the @ sign.
For example, in alice@ebay.com, alice is the local name, and ebay.com is the domain name.

Besides lowercase letters, these emails may contain '.'s or '+'s.
If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.
For example, "alice.z@ebay.com" and "alicez@ebay.com" forward to the same email address. (Note that this rule does not apply for domain names.)
If you add a plus ('+') in the local name, everything after the first plus sign will be ignored.
This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com. (Again, this rule does not apply for domain names.)

It is possible to use both of these rules at the same time.
Given a list of emails, we send one email to each address in the list.

How many different addresses actually receive mails?

Input: ["test.email+alex@e.bay.com","test.e.mail+bob.cathy@e.bay.com","testemail+bob.cathy@ebay.com", "testemail.bob+david@ebay.com", "te.stemai.lbob+alix@ebay.com"]
Output: 3
Explanation: ["testemail@e.bay.com","testemail@ebay.com","testemailbob@ebay.com"] actually receive mails


 */
public class EmailProblem {
    public static void main(String[] args) {
//        List<String> emails = new ArrayList();
//        emails.add("user@domain.com");
//        emails.add("user@domain.co.in");
//        emails.add("user.name@domain.com");
//        emails.add("user'name@domain.co.in");
//
////Invalid emails
//        emails.add(".username@yahoo.com");
//        emails.add("username@yahoo.com.");
//        emails.add("username@yahoo..com");

        String[] emails = new String[]{"test.email+alex@e.bay.com","test.e.mail+bob.cathy@e.bay.com","testemail+bob.cathy@ebay.com", "testemail.bob+david@ebay.com", "te.stemai.lbob+alix@ebay.com"};

        String regex = "^[a-zA-Z0-9+]+(?:\\.[a-zA-Z0-9+]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for(String email : emails){
             matcher= pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }



}
