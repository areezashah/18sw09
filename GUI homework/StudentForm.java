import javax.swing.*;
import java.awt.*;
public class StudentForm{
public static void main(String args[])
{
  JFrame f=new JFrame();
  f.setSize(400,500);
  f.setTitle("Student Bio Data");
  f.setLayout(null);
  f.setVisible(true);


  JLabel title= new JLabel("Registration Form");
  title.setForeground(Color.blue);
  title.setFont(new Font("Serif", Font.BOLD, 20));
  title.setBounds(100, 25, 300, 50);
  f.add(title);

  JLabel nameLabel=new JLabel("NAME");
  nameLabel.setBounds(20,70,80,20);

  JLabel fathernameLabel=new JLabel("FATHER NAME");
  fathernameLabel.setBounds(20,95,90,20);

  JLabel rollnumLabel=new JLabel("Roll NUM");
  rollnumLabel.setBounds(20,120,100,20);

  JLabel departmentLabel=new JLabel("DEPARTMENT");
  departmentLabel.setBounds(20,145,110,20);

  JLabel addressLabel=new JLabel("ADDRESS");
  addressLabel.setBounds(20,170,120,20);

  JLabel emailLabel=new JLabel("EMAIL");
  emailLabel.setBounds(20,195,130,20);

  JLabel passwordLabel=new JLabel("PASSWORD");
  passwordLabel.setBounds(20,220,140,20);

  JLabel genderLabel=new JLabel("GENDER");
  genderLabel.setBounds(20,245,150,20);


  JTextField nameTextField=new JTextField();
  nameTextField.setBounds(120,70,120,20);

  JTextField fathernameTextField=new JTextField();
  fathernameTextField.setBounds(120,95,120,20);

  JTextField rollnumTextField=new JTextField();
  rollnumTextField.setBounds(120,120,120,20);

  JTextField departmentTextField=new JTextField();
  departmentTextField.setBounds(120,145,120,20);

  JTextField addressTextField=new JTextField();
  addressTextField.setBounds(120,170,120,20);

  JTextField emailTextField=new JTextField();
  emailTextField.setBounds(120,195,120,20);

  JPasswordField password=new JPasswordField();
  password.setBounds(120,220,120,20);

  JRadioButton b1=new JRadioButton("MALE");
  b1.setBounds(120,245,130,20);

  JRadioButton b2=new JRadioButton("FEMALE");
  b2.setBounds(120,270,140,20);

  ButtonGroup g=new ButtonGroup();
  g.add(b1);
  g.add(b2);


  f.add(nameLabel);
  f.add(fathernameLabel);
  f.add(rollnumLabel);
  f.add(departmentLabel);
  f.add(addressLabel);
  f.add(emailLabel);
  f.add(passwordLabel);
  f.add(genderLabel);

  f.add(nameTextField);
  f.add(fathernameTextField);
  f.add(rollnumTextField);
  f.add(departmentTextField);
  f.add(addressTextField);
  f.add(emailTextField);
  f.add(password);
  f.add(b1);
  f.add(b2);

  JButton submitButton=new JButton("Submit");
  submitButton.setBounds(50,300,100,30);
  f.add(submitButton);

  JButton cancelButton=new JButton("Cancel");
  cancelButton.setBounds(200,300,100,30);
  f.add(cancelButton);


}
}