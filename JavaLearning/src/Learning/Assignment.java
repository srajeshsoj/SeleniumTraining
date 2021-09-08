package Learning;

import java.io.*;
import java.util.*;
import static java.lang.System.exit;
public class Assignment {
    public static void main(String[] str)throws IOException {
        List<EmpData> empDataList = new ArrayList<EmpData>();
        System.out.println("Welcome to Employ Management tool /n");
        System.out.println("----------------------------------");
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        while(true){
            System.out.println("Enter your choice \n 1.Add  2.Select    3.View  4.Export    5.Exit \n" );
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter employee details.\n Name and ID.");
                    EmpData empData = new EmpData(scanner.next(), scanner.next());
                    empDataList.add(empData);
                    break;
                case 2:
                    System.out.println("Enter Employee ID:");
                    String e_id = scanner.next();
                    System.out.println("Enter your choice. \n 1.Update 2.Delete 3.View  4.Exit");
                    int ch = scanner.nextInt();
                    switch (ch){
                        case 1:
                            int pos=0;
                            String emp_id;
                                for(EmpData tmp:empDataList){
                                    emp_id = tmp.eid;
                                    if(emp_id.equals(e_id) && pos < empDataList.size())
                                        break;
                                    else pos++;
                                }
                            System.out.println("Enter Employee Exp:");
                            empDataList.get(pos).work_exp = scanner.nextInt();
                            break;
                        case 2:
                            int pos1=0;
                            String emp_id1;
                            for(EmpData tmp:empDataList){
                                emp_id1 = tmp.eid;
                                if(emp_id1.equals(e_id) && pos1 < empDataList.size())
                                    break;
                                else pos1++;
                            }
                            empDataList.remove(pos1);
                            System.out.println("Employee Removed");

                            break;
                        case 3:
                            int pos2=0;
                            String emp_id2;
                            for(EmpData tmp:empDataList){
                                emp_id2 = tmp.eid;
                                if(emp_id2.equals(e_id) && pos2 < empDataList.size())
                                    break;
                                else pos2++;
                            }
                            System.out.println("ID:"+ empDataList.get(pos2).eid);
                            System.out.println("Name:" + empDataList.get(pos2).e_name);
                            System.out.println("Work Experience:" + empDataList.get(pos2).work_exp);
                            System.out.println("================================");
                            break;
                        case 4:
                            exit(0);
                            break;
                        default:
                            System.out.println("NO Employee.");

                    }
                    break;
                case 3:
                    if ( empDataList.size() != 0){
                    System.out.println("Employee Details:");
                    //Collections.sort();
                        for(EmpData empData1: empDataList){
                        System.out.println("ID:"+ empData1.eid);
                        System.out.println("Name:" + empData1.e_name);
                        System.out.println("Work Experience:" + empData1.work_exp);
                        System.out.println("================================");
                        }
                    }else
                        System.out.println("NO Employee.");
                    break;
                case 4:
                    String file_name = "C:\\Users\\00005370\\Documents\\data.txt";
                    FileWriter fw=new FileWriter(file_name);
                    for(EmpData empData1: empDataList)
                    fw.write(empData1.eid.toString() +" " + empData1.e_name.toString() +" " + empData1.work_exp +" \n");
                    fw.flush();
                    fw.close();
                    break;
                case 5:
                    exit(0);
                default:
                    System.out.println("NO Employee.");
            }
        }
    }
}
class EmpData {
    String e_name;
    String eid;
    int work_exp;
    EmpData(String e_name, String eid){
        this.eid = eid;
        this.e_name = e_name;
        this.work_exp = 0;
    }
}
