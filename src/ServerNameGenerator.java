import java.util.Random;

public class ServerNameGenerator {
   String[] Nouns = {
           "food",
           "tree",
           "celebration",
           "association",
           "establishment",
           "charity",
           "photo",
           "guest",
           "classroom",
           "revolution"
   };

   String[] Adjectives = {
           "disgusting",
           "inexpensive",
           "fast",
           "adorable",
           "practical",
           "jazzy",
           "panicky",
           "redundant",
           "testy",
           "early"
   };

   public static String getRandomString(String[] strArr){
      Random random = new Random();
      int randomIndex = random.nextInt(strArr.length);
      return strArr[randomIndex];
   }

   public static void main(String[] args){
      ServerNameGenerator server = new ServerNameGenerator();
      System.out.println("Here is your server name:");
      System.out.println(getRandomString(server.Adjectives) + "-" + getRandomString(server.Nouns));
   }
}


