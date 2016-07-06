package com.example.linyaye.myapplication123;

import java.util.List;

/**
 * 作者：linyaye on 2016/7/5 15:31
 * 邮箱：840567289@qq.com
 */
public class Bean {

    /**
     * firstName : Brett
     * lastName : McLaughlin
     * email : aaaa
     */

    private List<PeopleBean> people;

    public List<PeopleBean> getPeople() {
        return people;
    }

    public void setPeople(List<PeopleBean> people) {
        this.people = people;
    }

    public static class PeopleBean {
        private String firstName;
        private String lastName;
        private String email;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
