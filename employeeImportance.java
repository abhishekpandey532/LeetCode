/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> li=new HashMap<>();
        Queue<Integer> q=new LinkedList<>();
        
        for(Employee e:employees){
            li.put(e.id,e);
        }
        
        q.offer(id);
        int imp=0;
        while(!q.isEmpty()){
            Employee e1=li.get(q.poll());
            imp+=e1.importance;
            for(int e2:e1.subordinates){
                q.offer(e2);
            }
        }
        return imp;
        
        
        
        
        
    }
}