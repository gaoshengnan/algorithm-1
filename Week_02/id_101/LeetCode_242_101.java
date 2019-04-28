public boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        //如果长度不等，直接返回false
        if (s.length() != t.length()) return false;

        //将两个字符串转换为字符数组char[]
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        //使用Arrays的sort方法分别为两个字符数组排序
        //Arrays.sort使用的DualPivotQuickSort在经典快排基础上改进，时间复杂度稳定为O(nlogn)
        Arrays.sort(sChar);
        Arrays.sort(tChar);

        //比较排序后的两个字符数组是否相等
        return Arrays.equals(sChar, tChar);
}