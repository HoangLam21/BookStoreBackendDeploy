/*package com.team.bookstore.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "revenueYear")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RevenueYear extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int year;
    long total_sale;
    long total_import;
    long revenue;
   //@OneToMany(mappedBy = "revenueYear")
   // Set<RevenueMonth> revenueMonthSet;

}

 */