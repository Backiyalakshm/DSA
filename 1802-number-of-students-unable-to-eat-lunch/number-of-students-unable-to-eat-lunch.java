class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sand = new Stack<>();
        Queue<Integer> stu = new LinkedList<>();
        for(int i = sandwiches.length-1; i >=0 ;i--)
        {
            sand.push(sandwiches[i]);
        }
        for(int i=0; i < students.length; i++){
            stu.add(students[i]);
        }
        while(!stu.isEmpty() && stu.contains(sand.peek())){
              int ele = stu.poll();
              stu.add(ele);
              if(stu.peek() == sand.peek()){
                stu.poll();
                sand.pop();
              }
        }
        return stu.size();

    }
}