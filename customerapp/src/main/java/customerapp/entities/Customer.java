package customerapp.entities;


@Entity
@Table(name="Customer_info")
public class Customer  {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;
 
    @Column(name="name")
    protected String name;
}
 
    