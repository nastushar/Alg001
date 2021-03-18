package com.nastya;

public class SomeClass {
    private String name;


    public SomeClass ( String name ) {
        this.name = name;

    }

    public String getName () {
        return name;
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass ( ) != o.getClass ( ) ) {
            return false;
        }
        SomeClass another = (SomeClass) o;
        return this.name.equals ( another.name );

    }
}
