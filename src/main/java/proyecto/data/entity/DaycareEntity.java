package proyecto.data.entity;

import javax.persistence.*;
import java.io.Serializable;
    @Entity
    @Table(name = "daycare")
    public class DaycareEntity implements Serializable {
        //Attributes
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        @Column(nullable = false, length = 45)
        private String name;
        @Column(name = "night_price", nullable = false)
        private float nightPrice;
        @Column(nullable = false, length = 15)
        private String phone;
        @Column(nullable = false, length = 150)
        private String email;
        @Column(nullable = false, length = 150)
        private String address;
        @Column(nullable = false)
        private float ranking;

        // Constructor
        public DaycareEntity() {
        }

        public DaycareEntity(Integer id, String name, float night_price, String phone, String email, String address, float assessment) {
            this.id = id;
            this.name = name;
            this.nightPrice = night_price;
            this.phone = phone;
            this.email = email;
            this.address = address;
            this.ranking = assessment;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public float getNightPrice() {
            return nightPrice;
        }

        public void setNightPrice(float nightPrice) {
            this.nightPrice = nightPrice;
        }

        public float getRanking() {
            return ranking;
        }

        public void setRanking(float ranking) {
            this.ranking = ranking;
        }
    }
