public class Person
    {    
    private static final int UPPER_AGE = 150;   
    public static final int UNKNOWN = 99 ;
    public static final int MALE = 1 ;    
    public static final int FEMALE = 2;    
    private String forename ;    
    private String surname ;   
    private int age ;    
    private int gender;
	//NULL CONSTRUCTOR
    public Person()
        {
        forename = "NONE" ;
        surname = "NONE" ;
        age = 0 ;
        gender = UNKNOWN ;
        } // end of constructor method

    /** 
     * Creates an instance of the Person class with specified attribute
     * values
     * @param f forename of the person
     * @param s surname of the person
     * @param a age of the person
     * @param g gender of the person
     */
    public Person(String f, String s, int a, int g)
        {
        if (f.length() < 1)
            {
            System.err.println("bad forename argument in constructor") ;
	    System.exit(1) ;
	    }
        forename = f ;
        if (s.length() < 1)
            {
            System.err.println("bad surname argument in constructor") ;
	    System.exit(1) ;
	    }
        surname = s ;
        if ((a < 0) || (a > UPPER_AGE))
            {
            System.err.println("bad age argument in constructor") ;
            System.exit(1) ;
            }
        age = a ;
        if ((g != MALE) && (g != FEMALE) && (g != UNKNOWN))
            {
            System.err.println("bad gender argument in constructor") ;
            System.exit(1) ;
            }
        gender = g ;
        } // end of constructor method
    // Person Class Methods
	/**
     * returns the upper limit for a valid age
     * @return the upper limit for a valid age
     */
    public static int getUpperAgeLimit()
        {
        return UPPER_AGE ;
        } // end of method getUpperAgeLimit
    // Person Instance Methods - Selectors

    /**
     * returns the forename attribute of the person
     * @return the forename attribute of the person
     */
    public String getForename()
        {
        return forename ;
        } // end of method getForename

    /**
     * returns the surname attribute of the person
     * @return the surname attribute of the person
     */
    public String getSurname()
        {
        return surname ;
        } // end of method getSurname

    /**
     * returns the age attribute of the person
     * @return the age attribute of the person
     */
    public int getAge()
        {
        return age ;
        } // end of method getAge

    /**
     * returns the gender attribute of the person
     * @return the gender attribute of the person
     */
    public int getGender()
        {
        return gender ;
        } // end of method getGender

    /**
     * returns the gender attribute of the person as a String
     * @return the gender attribute of the person as a String
     */
    public String getGenderString()
        {
	String x = "unknown" ;
	switch (gender)
	    {
	    case MALE :
		x = "male" ;
		break ;
            case FEMALE :
		x = "female" ;
		break ;
            case UNKNOWN :
		x = "unknown" ;
		break ;
            }
        return x ;
        } // end of method getGenderString


    // Instance Methods - Mutators


    /**
     * set the forename attribute of the person
     * @param f the forename of the person
     */
    public void setForename(String f)
        {
        if (f.length() < 1)
            {
            System.err.println("bad forename argument in 'setForename'") ;
            System.exit(1) ;
            }
        forename = f ;
        } // end of method setForename

    /**
     * set the surname attribute of the person
     * @param s the surname of the person
     */
    public void setSurname(String s)
        {
        if (s.length() < 1)
            {
            System.err.println("bad surname argument in 'setSurname'") ;
            System.exit(1) ;
            }
        surname = s ;
        } // end of method setSurname

    /**
     * set the age attribute of the person
     * @param a the age of the person
     */
    public void setAge(int a)
        {
        if ((a < 0) || (a > UPPER_AGE))
            {
            System.err.println("bad age argument in 'setAge'") ;
            System.exit(1) ;
            }
        age = a ;
        } // end of method setAge

    /**
     * set the gender atribute of the person
     * @param g the gender of the person
     */
    public void setGender(int g)
        {
        if ((g != MALE) && (g != FEMALE) && (g != UNKNOWN))
            {
            System.err.println("bad gender argument in 'setGender'") ;
            System.exit(1) ;
            }
        gender = g ;
        } // end of method setGender
    

    // Other Person Methods

    /**
     * increase the age of the person by the specified amount
     * @param n the number of years by which the age attribute should
     *          be increased
     */
    public void increaseAge(int n)
        {
	if ((n < 1) || (age + n > UPPER_AGE))
	    {
            System.err.println("bad age in 'increaseAge'") ;
            System.exit(1) ;
	    }
        age += n ;
        } // end of method increaseAge

    /**
     * set the full name of the person in one operation
     * @param f the forename of the person
     * @param s the surname of the person
     */
    public void setFullName(String f, String s)
        {
        if ((f.length() < 1) || (s.length() < 1))
            {
            System.err.println("bad name arguments (s) in 'setFullName'") ;
            System.exit(1) ;
            }
        forename = f ;
        surname = s ;
        } // end of method setFullName

    /**
     * return the formal title of the person
     * @return the formal name of the person ('Mr' or 'Ms', initial, surname)
     */
    public String formalTitle()
        {
        String s;
   
        if (gender == MALE)
            s = "Mr " ;
        else if (gender == FEMALE)
            s = "Ms " ;
        else
            s = "" ;
        return s + forename.charAt(0) + ". " + surname ;
        } // end of method formalTitle

    /**
     * return a string representing the person
     * @return details of the person ('forename surname (age: gender)')
     */
    public String toString()
	{
	return forename + ' ' + surname + " (" + age + ": " +
	       getGenderString() + ')' ;
	} // end of method toString

    /**
     * return a copy of the person
     * @return a copy of the Person instance
     */
    public Person copy()
	{
	Person result = new Person() ;
	result.forename = new String(forename) ;
	result.surname = new String(surname) ;
	result.age = age ;
	result.gender = gender ;
	return result ;
	} // end of method copy

    } // end of class Person


