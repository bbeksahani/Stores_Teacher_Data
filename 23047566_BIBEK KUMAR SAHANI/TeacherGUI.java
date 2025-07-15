import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class TeacherGUI{
    public static void main (String[]args) {
        //creating Array list A1
        ArrayList <Teacher> A1 = new ArrayList<Teacher>();
        
        //Creating new Jframe
        JFrame jf1 = new JFrame("Teacher GUI");
        jf1.setSize(750, 470);
        jf1.setLayout(null);
        jf1.setResizable(false);
        
        //Creating new JPanel
        JPanel jp1 = new JPanel();
        jp1.setBounds(0, 0, 750, 500);
        jp1.setLayout(null);
        jp1.setBackground(new Color(223,245,209));
        jf1.add(jp1);
        
        
        //Creating JLabels
        JLabel l1 = new JLabel("Lecturer");
        
        JLabel l2 = new JLabel("Teacher ID:");
        JLabel l3 = new JLabel("Teacher Name:");
        JLabel l4 = new JLabel("Address:");
                
        JLabel l5 = new JLabel("Working Type:");
        JLabel l6 = new JLabel("Employment Status:");
        JLabel l10 = new JLabel("Working Hour:");
        
        JLabel l7 = new JLabel("Department:");
        JLabel l8 = new JLabel("Graded Score:");
        JLabel l9 = new JLabel("Years of Experience:");
        
        //setting the font of JLabel 
        l1.setFont(new Font("Serif", Font.PLAIN, 25));
        
        //Creating textFilelds
        JTextField jtf2 = new JTextField();
        JTextField jtf3 = new JTextField();
        JTextField jtf4 = new JTextField();
        
        JTextField jtf5 = new JTextField();
        JTextField jtf6 = new JTextField();
        JTextField jtf10 = new JTextField();
        
        JTextField jtf7 = new JTextField();
        JTextField jtf8 = new JTextField();
        JTextField jtf9 = new JTextField();
        
        //Creating Buttons
        JButton jb1 = new JButton("Add");
        JButton jb2 = new JButton("Grade Assignment");
        JButton jb3 = new JButton("Display");
        JButton jb4 = new JButton("Clear");
        JButton jb5 = new JButton("Tutor");
        
        
        //for setting the bounds of labels
        l1.setBounds(325, 10, 130, 35);
        
        l2.setBounds(25, 80, 150, 35);
        l3.setBounds(25, 115, 150, 35);
        l4.setBounds(25, 150, 150, 35);
        
        l5.setBounds(370, 80, 150, 35);
        l6.setBounds(370, 115, 150, 35);
        l10.setBounds(370, 150, 150, 35);

        l7.setBounds(25, 220, 150, 35);
        l8.setBounds(25, 255, 150, 35);
        l9.setBounds(25, 290, 150, 35);
        

        //for setting bounds of textfields
        jtf2.setBounds(130, 83, 75, 25);
        jtf3.setBounds(130, 118, 150, 25);
        jtf4.setBounds(130, 153, 150, 25);
        
        jtf5.setBounds(490, 83, 150, 25);
        jtf6.setBounds(490, 118, 150, 25);
        jtf10.setBounds(490, 153, 150, 25);
        
        jtf7.setBounds(160, 223, 150, 25);
        jtf8.setBounds(160, 258, 150, 25);
        jtf9.setBounds(160, 293, 150, 25);
        
        
        jb1.setBounds(25, 390, 100, 25);
        jb2.setBounds(70, 335, 150, 25);
        jb3.setBounds(185, 390, 100, 25);
        jb4.setBounds(370, 390, 100, 25);
        jb5.setBounds(555, 390, 100, 25);
        
        //for adding labels
        jp1.add(l1);
        
        jp1.add(l2);
        jp1.add(l3);
        jp1.add(l4);
        
        jp1.add(l5);
        jp1.add(l6);
        jp1.add(l10);

        jp1.add(l7);
        jp1.add(l8);
        jp1.add(l9);
        
        //for adding textfield
        jp1.add(jtf2);
        jp1.add(jtf3);
        jp1.add(jtf4);
        
        jp1.add(jtf5);
        jp1.add(jtf6);
        jp1.add(jtf10);

        jp1.add(jtf7);
        jp1.add(jtf8);
        jp1.add(jtf9);
        
        //for adding buttons
        jp1.add(jb1);
        jp1.add(jb2);
        jp1.add(jb3);
        jp1.add(jb4);
        jp1.add(jb5);
        
        //to add function of button for adding the lecturer
        jb1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae) {    
            try {
                //converting teacherID, YearsofExperience, and GradedScore into integer
                int teacherId = Integer.parseInt(jtf2.getText());
                String teacherName = jtf3.getText();
                String address = jtf4.getText();
                String workingType = jtf5.getText();
                String employmentStatus = jtf6.getText();
                int yearsOfExperience = Integer.parseInt(jtf9.getText());
                //int gradedScore = Integer.parseInt(jtf8.getText());
                String department = jtf7.getText();
                int workingHour = Integer.parseInt(jtf10.getText());

                Lecturer L1 = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus, department, yearsOfExperience, workingHour);
                A1.add(L1);
                
                //to verify the form is properly filled
                JOptionPane.showMessageDialog(null, "Lecturer added successfully!");
            } 
            catch (NumberFormatException e) { //it handles the exception
                JOptionPane.showMessageDialog(null, "Invalid Input!");
            }
            }
        });
        
        
        //to add function in grade the assignment button
        jb2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae) {
            try {
                int yearsOfExperience = Integer.parseInt(jtf9.getText());
                int gradedScore = Integer.parseInt(jtf8.getText());
                String department = jtf7.getText();
            
                for (Teacher t :A1) {
                    if (t instanceof Lecturer) {
                        //downcasting
                        Lecturer L1 = (Lecturer) t;
                        L1.gradeAssignment(gradedScore, department, yearsOfExperience);
                        
                    }
                }
                
                //to verify the form is properly filled
                JOptionPane.showMessageDialog(null, "Grade Assigned successfully!");
                }
                catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input for ID, Years of Experience, or Graded Score!");
                }
            }
        });
        
        //to add the function to display the lecturer
        jb3.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent ae) 
           {
               for (Teacher t : A1) 
               {
                   if (t instanceof Lecturer) 
                   {
                       //downcasting for displaying the lecturer
                       Lecturer L1 = (Lecturer) t;
                       L1.displayLecturerInfo();
                   }
               }
           }
        });
        
        //to add the function clear the textfield of lecturer 
        jb4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) {
                
                jtf2.setText("");
                jtf3.setText("");
                jtf4.setText("");
                jtf5.setText("");
                jtf6.setText("");
                jtf7.setText("");
                jtf8.setText("");
                jtf9.setText("");
                jtf10.setText("");
                
                JOptionPane.showMessageDialog(null, "Textfields are cleared!");
            }
        });
        
        //to add the function of changing lecturer to tutor
        jb5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
        //creating new JPanel
        JPanel jp2 = new JPanel();
        jp2.setBounds(0, 0, 750, 500);
        jp2.setLayout(null);
        jp2.setBackground(new Color(223,245,209));
        jf1.add(jp2);
               
        //for creating label for tutor
        JLabel l_1 = new JLabel("Tutor");
        
        JLabel l_2 = new JLabel("Teacher ID:");
        JLabel l_3 = new JLabel("Teacher Name:");
        JLabel l_4 = new JLabel("Address:");
                         
        JLabel l_5 = new JLabel("Working Type:");
        JLabel l_6 = new JLabel("Working Hours:");
        JLabel l_7 = new JLabel("Specialization:");
        JLabel l_8 = new JLabel("Employment Status:");
        JLabel l_9 = new JLabel("Academic Qualification:"); 
        
        JLabel l_10 = new JLabel("Salary:");
        JLabel l_11 = new JLabel("Performance Index:");
        
        l_1.setFont(new Font("Serif", Font.PLAIN, 25));
        
        //for creating textfield for tutor
        JTextField jtf_2 = new JTextField();
        JTextField jtf_3 = new JTextField();
        JTextField jtf_4 = new JTextField();
        
        JTextField jtf_5 = new JTextField();
        JTextField jtf_6 = new JTextField();
        JTextField jtf_7 = new JTextField();
        JTextField jtf_8 = new JTextField();
        JTextField jtf_9 = new JTextField();
        
        JTextField jtf_10 = new JTextField();
        JTextField jtf_11 = new JTextField();
                    
        //for adding buttons for tutor
        JButton jb_1 = new JButton("Add");
        JButton jb_2 = new JButton("Set Salary");
        JButton jb_3 = new JButton("Remove Tutor");
        JButton jb_4 = new JButton("Display");
        JButton jb_5 = new JButton("Clear");
        JButton jb_6 = new JButton("Lecturer");
                
        //for setting the bounds of labels
        l_1.setBounds(325, 10, 130, 35);
                
        l_2.setBounds(25, 80, 150, 35);
        l_3.setBounds(25, 115, 150, 35);
        l_4.setBounds(25, 150, 150, 35);
                
        l_5.setBounds(25, 220, 150, 35);
        l_6.setBounds(25, 255, 150, 35);
        l_7.setBounds(25, 290, 150, 35);
        l_8.setBounds(25, 325, 150, 35);
        l_9.setBounds(400, 150, 150, 35);
        
        l_10.setBounds(400, 80, 150, 35);
        l_11.setBounds(400, 115, 150, 35);
        

            
        //for setting the bounds of textfields
        jtf_2.setBounds(130, 83, 75, 25);
        jtf_3.setBounds(130, 118, 150, 25);
        jtf_4.setBounds(130, 153, 150, 25);
                
        jtf_5.setBounds(150, 223, 150, 25);
        jtf_6.setBounds(150, 258, 150, 25);
        jtf_7.setBounds(150, 293, 150, 25);
        jtf_8.setBounds(150, 328, 150, 25);
        jtf_9.setBounds(550, 158, 150, 25);
    
        jtf_10.setBounds(550, 83, 150, 25);
        jtf_11.setBounds(550, 118, 150, 25);
                       
                
        //for setting the bounds of buttons
        jb_1.setBounds(25, 390, 100, 25);
        jb_2.setBounds(470, 210, 150, 25);
        jb_3.setBounds(455, 255, 180, 25);
        jb_4.setBounds(185, 390, 100, 25);
        jb_5.setBounds(370, 390, 100, 25);
        jb_6.setBounds(555, 390, 100, 25);
                
            
        //for adding labels
        jp2.add(l_1);
                
        jp2.add(l_2);
        jp2.add(l_3);
        jp2.add(l_4);
                
        jp2.add(l_5);
        jp2.add(l_6);
        jp2.add(l_7);
        jp2.add(l_8);
        jp2.add(l_9);
        
        jp2.add(l_10);
        jp2.add(l_11);
        
        
        //for adding textfield
        jp2.add(jtf_2);
        jp2.add(jtf_3);
        jp2.add(jtf_4);
    
        jp2.add(jtf_5);
        jp2.add(jtf_6);
        jp2.add(jtf_7);
        jp2.add(jtf_8);
        jp2.add(jtf_9); 
        
        jp2.add(jtf_10);
        jp2.add(jtf_11);
               
        
        //for adding buttons
        jp2.add(jb_1);
        jp2.add(jb_2);
        jp2.add(jb_3);
        jp2.add(jb_4);
        jp2.add(jb_5);
        jp2.add(jb_6);
                
        jf1.getContentPane();
        jf1.remove(jp1);
        jf1.revalidate();
        jf1.repaint();
        
        
        //to add the function to add the tutor in add button 
        jb_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae) {
            try {
                //converting teacherID, YearsofExperience, and GradedScore into integer
                int teacherId = Integer.parseInt(jtf_2.getText());
                String teacherName = jtf_3.getText();
                String address = jtf_4.getText();
                String workingType = jtf_5.getText();
                String employmentStatus = jtf_8.getText();
                int workingHours = Integer.parseInt(jtf_6.getText());
                double salary = Double.parseDouble(jtf_10.getText());
                String specialization = jtf_7.getText();
                String academicQualification = jtf_9.getText();
                int performanceIndex = Integer.parseInt(jtf_11.getText());

                Tutor T1 = new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours, salary, specialization, academicQualification, performanceIndex);
                A1.add(T1);
                
                //to verify the form is properly filled
                JOptionPane.showMessageDialog(null, "Tutor added successfully!");
            } 
            catch (NumberFormatException e) { //it handles the exception
                JOptionPane.showMessageDialog(null, "Invalid Input!");
            }
            }
        });
        
        //to add the function to set salary in set salary button
        jb_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae) {
            try{ 
                double salary = Double.parseDouble(jtf_10.getText());
                int performanceIndex = Integer.parseInt(jtf_11.getText());
                for (Teacher t : A1) {
                    if (t instanceof Tutor) {
                        Tutor T0 = (Tutor) t;
                        
                        T0.setSalaryAndPerformanceIndex(salary, performanceIndex);
                        
                        JOptionPane.showMessageDialog(null, "Salary and performance index have been set succesfully!");
                    }
                }
            }
            
            catch (NumberFormatException e) { //it handles the exception
                JOptionPane.showMessageDialog(null, "Invalid input for salary and performance Index!");
            }
                }
        });
        
        //to add the function of remove tutor in remove button
        jb_3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae) {
                for (Teacher t : A1) {
                    if (t instanceof Tutor && t.getTeacherId() ==Integer.parseInt( jtf_2.getText())) {
                        Tutor T2 = (Tutor) t;
                        T2.removeTutor();
                        
                        JOptionPane.showMessageDialog(null, "Tutor has been removed succesfully!");
                        break;
                    }   
                }
            }
        });
        
        //to add the function of display tutor info in display button
        jb_4.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent ae) 
           {
               for (Teacher t : A1) 
               { 
                   if (t instanceof Tutor ) 
                   {
                       //downcasting for displaying the tutor info
                       Tutor T1 = (Tutor) t;
                       T1.displayTutorInfo();
                   }
               }
           }
        });
        
        //for clearing all the fieldbox
        jb_5.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) {
                jtf_2.setText("");
                jtf_3.setText("");
                jtf_4.setText("");
                jtf_5.setText("");
                jtf_6.setText("");
                jtf_7.setText("");
                jtf_8.setText("");
                jtf_9.setText("");
                jtf_10.setText("");
                jtf_11.setText("");
        
                JOptionPane.showMessageDialog(null, "Textfields are cleared!");
            }
        });
             
        //for returning back to lecturer 
        jb_6.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) {
               // Removing the tutor panel (jp2)
               jf1.getContentPane();
               jf1.remove(jp2);
                            
               // Adding the lecturer panel (jp1) back to the JFrame
               jf1.add(jp1);
               jf1.revalidate();
               jf1.repaint(); 
                                
                }
            });
            }
        });
        
        //to set the frame visible
        jf1.setVisible(true);
    }
}