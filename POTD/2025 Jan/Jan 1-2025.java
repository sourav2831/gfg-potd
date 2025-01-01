class Solution {
    public static boolean isAnagram(String str1,String str2)
    {
        if(str1.length()!=str2.length()) return false;
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static ArrayList<String> checkAnagrams(String str,String[] arr)
    {
        ArrayList<String> strList=new ArrayList<>();
        for(String s:arr)
        {
            if(isAnagram(str,s))
            {
                strList.add(s);
            }
        }
        return strList;
    }
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        ArrayList<ArrayList<String>> result=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        for(String str:arr)
        {
            if(!set.contains(str))
            {
                ArrayList<String> group=checkAnagrams(str,arr);
                result.add(group);
                set.addAll(group);
            }
        }
        return result;
    }
}