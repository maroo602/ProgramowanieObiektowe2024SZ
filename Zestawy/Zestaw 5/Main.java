import java.util.ArrayList;
import java.util.Collections;
public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
    ArrayList<Integer> result = new ArrayList<>(tab1);
    result.addAll(tab2);
    return result;
}
public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
    ArrayList<Integer> result = new ArrayList<>();
    int i = 0, j = 0;

    while (i < tab1.size() && j < tab2.size()) {
        result.add(tab1.get(i++));
        result.add(tab2.get(j++));
    }

    while (i < tab1.size()) {
        result.add(tab1.get(i++));
    }
    while (j < tab2.size()) {
        result.add(tab2.get(j++));
    }

    return result;
}

public static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
    ArrayList<Integer> merged = new ArrayList<>(tab1);
    merged.addAll(tab2);
    Collections.sort(merged);
    return merged;
}


public static ArrayList<Character> toArrayList(String napis) {
    ArrayList<Character> list = new ArrayList<>();
    for (char ch : napis.toCharArray()) {
        list.add(ch);
    }
    Collections.sort(list);
    return list;
}
public static ArrayList<Integer> toArrayList(int liczba) {
    ArrayList<Integer> list = new ArrayList<>();
    String liczbaStr = String.valueOf(liczba);
    for (char ch : liczbaStr.toCharArray()) {
        list.add(Character.getNumericValue(ch));
    }
    Collections.sort(list);
    return list;
}
public static boolean checkChar(ArrayList<Character> tab, char znak) {
    return tab.contains(znak);
}
public static boolean checkDigit(ArrayList<Integer> tab, int cyfra) {
    return tab.contains(cyfra);
}
public static int countChar(ArrayList<Character> tab, char znak) {
    int count = 0;
    for (int i = 0; i < tab.size(); i++) {
        if (tab.get(i) == znak) {
            count++;
        }
    }
    return count;
}

public static int countDigit(ArrayList<Integer> tab, int cyfra) {
    int count = 0;
    for (int i = 0; i < tab.size(); i++) {
        if (tab.get(i) == cyfra) {
            count++;
        }
    }
    return count;
}

public static ArrayList<ArrayList<Object>> uniqueArrayList(ArrayList<String> tab) {
    ArrayList<ArrayList<Object>> result = new ArrayList<>();
    HashSet<String> uniqueItems = new HashSet<>(tab);
    for (String item : uniqueItems) {
        ArrayList<Object> pair = new ArrayList<>();
        pair.add(item);
        pair.add(0);
        result.add(pair);
    }
    return result;
}
public static ArrayList<ArrayList<Object>> uniqueArrayList2(ArrayList<Integer> tab) {
    ArrayList<ArrayList<Object>> result = new ArrayList<>();
    HashSet<Integer> uniqueItems = new HashSet<>(tab);
    for (Integer item : uniqueItems) {
        ArrayList<Object> pair = new ArrayList<>();
        pair.add(item);
        pair.add(0);
        result.add(pair);
    }
    return result;
}
public static ArrayList<ArrayList<Object>> countArrayList(ArrayList<String> tab) {
    ArrayList<ArrayList<Object>> result = new ArrayList<>();
    HashMap<String, Integer> frequencyMap = new HashMap<>();
    for (String item : tab) {
        frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
    }
    for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
        ArrayList<Object> pair = new ArrayList<>();
        pair.add(entry.getKey());
        pair.add(entry.getValue());
        result.add(pair);
    }
    return result;
}
public static ArrayList<ArrayList<Object>> countArrayList2(ArrayList<Integer> tab) {
    ArrayList<ArrayList<Object>> result = new ArrayList<>();
    HashMap<Integer, Integer> frequencyMap = new HashMap<>();
    for (Integer item : tab) {
        frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
    }
    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
        ArrayList<Object> pair = new ArrayList<>();
        pair.add(entry.getKey());
        pair.add(entry.getValue());
        result.add(pair);
    }
    return result;
}


public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 3, 5));
    ArrayList<Integer> list2 = new ArrayList<>(List.of(2, 4, 6, 8, 10));
    // Zadanie 1
    ArrayList<Integer> appended = append(list1, list2);
    System.out.println("Append: " + appended);

    // Zadanie 2
    ArrayList<Integer> merged = merge(list1, list2);
    System.out.println("Merge: " + merged);

    // Zadanie 3
    ArrayList<Integer> list3 = new ArrayList<>(List.of(1, 3, 5));
    ArrayList<Integer> list4 = new ArrayList<>(List.of(2, 4, 6));
    System.out.println(mergeSorted(list3, list4));

    // Zadanie 4
    System.out.println(toArrayList("ghjkasjhvzxa"));
    System.out.println(toArrayList(12345));

    // Zadanie 5
    ArrayList<Character> charList = toArrayList("assst");
    System.out.println(checkChar(charList, 's'));
    System.out.println(checkChar(charList, 'z'));

    ArrayList<Integer> digitList = toArrayList(2023223);
    System.out.println(checkDigit(digitList, 2));
    System.out.println(checkDigit(digitList, 5));

    // Zadanie 6
    System.out.println(countChar(charList, 's'));
    System.out.println(countDigit(digitList, 2));
    // Zadanie 7 i 8
    ArrayList<Integer> intList = new ArrayList<>(List.of(1, 4, 5, 5, 7, 7));
    ArrayList<String> stringList = new ArrayList<>(List.of("a", "b", "a", "c", "c", "c"));

    System.out.println(uniqueArrayList2(intList));
    System.out.println(uniqueArrayList(stringList));
    System.out.println(countArrayList2(intList));
    System.out.println(countArrayList(stringList));
}
