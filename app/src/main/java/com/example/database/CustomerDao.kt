package com.example.database


import androidx.room.*
import kotlinx.coroutines.flow.Flow


@Dao
interface CustomerDao {
    @Query("SELECT * FROM CustomerTable WHERE costumer_name") //tabloyu okur  get retrodfit
    fun getCustomers(): Flow<List<CustomerEntity>>

    fun getCustomer(customerId:Int): Flow<CustomerEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)//Yeni ekleme -POST_> retrofit (tek tek ekleme yapr)
    suspend fun addCustomer(customerEntity: CustomerEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)//çoklu ekleme yapar
    suspend fun addCustomer(customerEntity:List< CustomerEntity>)


    @Update //varolanı güncelleme put retrofit
    suspend fun updateCustomer(customerEntity: CustomerEntity)
    @Delete //silmek için
    suspend fun deleteCustomer(customerEntity: CustomerEntity)

//where filtreleme yapmak için or veya  and ile ikinci bir sorgu ekleyebiliriz
    // where kelimeye göre arama yapar gibi like var like karakterie göre arama yapar
    //abort işlemi iptal eder ignore ilkini iptal eder 2.sini okeyler replace ad soyadı yer değiştirir
}