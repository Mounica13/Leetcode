class Solution {
    public String reorderSpaces(String text) {
      int spaceCount = 0, wordCount = 0, spaceBetweenWords = 0, extraSpaces = 0;
      for(int i = 0; i < text.length(); i++){
          if(text.charAt(i) == ' ') {
              spaceCount++;
          }
      }
       
    
      text = text.trim();
      String[] words = text.split("\s+");
      wordCount = words.length;
      
      
      if(wordCount <= 1){
        extraSpaces = spaceCount; 
      }  
     else{
        spaceBetweenWords = spaceCount / (wordCount - 1); 
        extraSpaces = spaceCount % (wordCount - 1);
     }
    
    
    StringBuilder newText = new StringBuilder();
    for(int i = 0; i < wordCount; i++){
        newText.append(words[i]);
        if(i != wordCount - 1){
            for(int j = 0; j < spaceBetweenWords; j++){
                newText.append("\s");
            }
        }
        else
            for(int j = 0; j < extraSpaces; j++){
                newText.append("\s");
            }
        }
         return newText.toString();
    }
}

//Time complexity :O(n)
//Space complexity : O(n)