/*package com.team.bookstore.Entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Entity
@Table(name = "revenueMonth")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RevenueMonth {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int month;
    long total_sale;
    long total_import;
    long revenue;
    /*
    @ManyToOne
    @MapsId("month")
    @JoinColumn(name = "fk_year")
    RevenueYear     revenueYear;
    @OneToMany(mappedBy = "revenueMonth")
    Set<RevenueDay> revenueDaySet;

     */
//}
