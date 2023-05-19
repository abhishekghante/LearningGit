package com.RedmineApi.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



	@Entity
	@Table(name = "users")
	public class User {

	    @Id
	    @GeneratedValue(generator = "increment")
	    //@GeneratedValue(strategy = GenerationType.AUTO)
	    @GenericGenerator(name = "increment",strategy = "increment")
	    private int id;

	    @Column(name = "login")
	    private String login;
	    
	    
	    @Column(name = "hashed_password")
	    private String hashed_password;
	    


	    @Column(name = "firstname")
	    private String firstname;

	    @Column(name = "lastname")
	    private String lastname;


	    @Column(name = "admin")
	    private Integer admin;

		
	    @Column(name = "status")
	    private Integer status;

	  
	    private LocalDateTime last_login_on = LocalDateTime.now();

	    @Column(name = "language")
	    private String language;
	    
	    @Column(name = "auth_source_id")
	    private Integer auth_source_id;

	    @Column(name = "created_on")
	    private LocalDateTime created_on;
	  
	    @Column(name = "updated_on")
	    private LocalDateTime updatedOn;

	    @Column(name = "type")
	    private String type;
	   
	   
	    @Column(name = "mail_notification")
	    private String mail_notification;


	    @Column(name = "salt")
	    private String salt;

	    
	    @Column(name = "must_change_passwd")
	    private Integer mustChangePasswd;

	    @Column(name = "passwd_change_on")
	    private LocalDateTime passwdChangeOn;

	    @Column(name = "twofa_schema")
	    private String twofaSchema;

	    @Column(name = "twofa_totp_key")
	    private String twofaTotpKey;

	    @Column(name = "twofa_totp_last_used_at")
	    private Integer twofaTotpLastUsedAt;

	    
		
	    @Column(name = "twofa_required")
	    private Integer twofaRequired;


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getLogin() {
			return login;
		}


		public void setLogin(String login) {
			this.login = login;
		}


		public String getHashed_password() {
			return hashed_password;
		}


		public void setHashed_password(String hashed_password) {
			this.hashed_password = hashed_password;
		}


		public String getFirstname() {
			return firstname;
		}


		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}


		public String getLastname() {
			return lastname;
		}


		public void setLastname(String lastname) {
			this.lastname = lastname;
		}


		public Integer getAdmin() {
			return admin;
		}


		public void setAdmin(Integer admin) {
			this.admin = admin;
		}


		public Integer getStatus() {
			return status;
		}


		public void setStatus(Integer status) {
			this.status = status;
		}


		public LocalDateTime getLast_login_on() {
			return last_login_on;
		}


		public void setLast_login_on(LocalDateTime last_login_on) {
			this.last_login_on = last_login_on;
		}


		public String getLanguage() {
			return language;
		}


		public void setLanguage(String language) {
			this.language = language;
		}


		public Integer getAuth_source_id() {
			return auth_source_id;
		}


		public void setAuth_source_id(Integer auth_source_id) {
			this.auth_source_id = auth_source_id;
		}


		public LocalDateTime getCreated_on() {
			return created_on;
		}


		public void setCreated_on(LocalDateTime created_on) {
			this.created_on = created_on;
		}


		public LocalDateTime getUpdatedOn() {
			return updatedOn;
		}


		public void setUpdatedOn(LocalDateTime updatedOn) {
			this.updatedOn = updatedOn;
		}


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}


		public String getMail_notification() {
			return mail_notification;
		}


		public void setMail_notification(String mail_notification) {
			this.mail_notification = mail_notification;
		}


		public String getSalt() {
			return salt;
		}


		public void setSalt(String salt) {
			this.salt = salt;
		}


		public Integer getMustChangePasswd() {
			return mustChangePasswd;
		}


		public void setMustChangePasswd(Integer mustChangePasswd) {
			this.mustChangePasswd = mustChangePasswd;
		}


		public LocalDateTime getPasswdChangeOn() {
			return passwdChangeOn;
		}


		public void setPasswdChangeOn(LocalDateTime passwdChangeOn) {
			this.passwdChangeOn = passwdChangeOn;
		}


		public String getTwofaSchema() {
			return twofaSchema;
		}


		public void setTwofaSchema(String twofaSchema) {
			this.twofaSchema = twofaSchema;
		}


		public String getTwofaTotpKey() {
			return twofaTotpKey;
		}


		public void setTwofaTotpKey(String twofaTotpKey) {
			this.twofaTotpKey = twofaTotpKey;
		}


		public Integer getTwofaTotpLastUsedAt() {
			return twofaTotpLastUsedAt;
		}


		public void setTwofaTotpLastUsedAt(Integer twofaTotpLastUsedAt) {
			this.twofaTotpLastUsedAt = twofaTotpLastUsedAt;
		}


		public Integer getTwofaRequired() {
			return twofaRequired;
		}


		public void setTwofaRequired(Integer twofaRequired) {
			this.twofaRequired = twofaRequired;
		}


		public User(int id, String login, String hashed_password, String firstname, String lastname, Integer admin,
				Integer status, LocalDateTime last_login_on, String language, Integer auth_source_id,
				LocalDateTime created_on, LocalDateTime updatedOn, String type, String mail_notification, String salt,
				Integer mustChangePasswd, LocalDateTime passwdChangeOn, String twofaSchema, String twofaTotpKey,
				Integer twofaTotpLastUsedAt, Integer twofaRequired) {
			super();
			this.id = id;
			this.login = login;
			this.hashed_password = hashed_password;
			this.firstname = firstname;
			this.lastname = lastname;
			this.admin = admin;
			this.status = status;
			this.last_login_on = last_login_on;
			this.language = language;
			this.auth_source_id = auth_source_id;
			this.created_on = created_on;
			this.updatedOn = updatedOn;
			this.type = type;
			this.mail_notification = mail_notification;
			this.salt = salt;
			this.mustChangePasswd = mustChangePasswd;
			this.passwdChangeOn = passwdChangeOn;
			this.twofaSchema = twofaSchema;
			this.twofaTotpKey = twofaTotpKey;
			this.twofaTotpLastUsedAt = twofaTotpLastUsedAt;
			this.twofaRequired = twofaRequired;
		}


		public User() {
			super();
			// TODO Auto-generated constructor stub
		}


		@Override
		public String toString() {
			return "User [id=" + id + ", login=" + login + ", hashed_password=" + hashed_password + ", firstname="
					+ firstname + ", lastname=" + lastname + ", admin=" + admin + ", status=" + status
					+ ", last_login_on=" + last_login_on + ", language=" + language + ", auth_source_id="
					+ auth_source_id + ", created_on=" + created_on + ", updatedOn=" + updatedOn + ", type=" + type
					+ ", mail_notification=" + mail_notification + ", salt=" + salt + ", mustChangePasswd="
					+ mustChangePasswd + ", passwdChangeOn=" + passwdChangeOn + ", twofaSchema=" + twofaSchema
					+ ", twofaTotpKey=" + twofaTotpKey + ", twofaTotpLastUsedAt=" + twofaTotpLastUsedAt
					+ ", twofaRequired=" + twofaRequired + "]";
		}



	  
	
	    
	    

}
