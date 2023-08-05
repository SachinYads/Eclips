package Assignment6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.IsoChronology;
import java.time.chrono.IsoEra;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;
import java.util.Collection;
import java.util.stream.Stream;

public class Order {
	 /**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the orderDate
	 */
	public LocalDate getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * @return the deliveryDate
	 */
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	/**
	 * @param deliveryDate the deliveryDate to set
	 */
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	public Order(Long id, LocalDate orderDate, LocalDate deliveryDate, String status) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
	}
	public Order(long l, String string, String string2, String string3, int i) {
		// TODO Auto-generated constructor stub
	}
	public Order(Long id, LocalDate orderDate, LocalDate deliveryDate, String status) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
	}
	private Long id;
	  
	  private LocalDate orderDate;
	  private LocalDate deliveryDate;
	  private String status;
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", status=" + status
				+ ", getId()=" + getId() + ", getOrderDate()=" + getOrderDate() + ", getDeliveryDate()="
				+ getDeliveryDate() + ", getStatus()=" + getStatus() + "]";
	}
	public static Collection<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param field
	 * @return
	 * @see java.time.LocalDate#isSupported(java.time.temporal.TemporalField)
	 */
	public boolean isSupported(TemporalField field) {
		return deliveryDate.isSupported(field);
	}
	/**
	 * @param unit
	 * @return
	 * @see java.time.LocalDate#isSupported(java.time.temporal.TemporalUnit)
	 */
	public boolean isSupported(TemporalUnit unit) {
		return deliveryDate.isSupported(unit);
	}
	/**
	 * @param field
	 * @return
	 * @see java.time.LocalDate#range(java.time.temporal.TemporalField)
	 */
	public ValueRange range(TemporalField field) {
		return deliveryDate.range(field);
	}
	/**
	 * @param field
	 * @return
	 * @see java.time.LocalDate#get(java.time.temporal.TemporalField)
	 */
	public int get(TemporalField field) {
		return deliveryDate.get(field);
	}
	/**
	 * @param field
	 * @return
	 * @see java.time.LocalDate#getLong(java.time.temporal.TemporalField)
	 */
	public long getLong(TemporalField field) {
		return deliveryDate.getLong(field);
	}
	/**
	 * @return
	 * @see java.time.LocalDate#getChronology()
	 */
	public IsoChronology getChronology() {
		return deliveryDate.getChronology();
	}
	/**
	 * @return
	 * @see java.time.LocalDate#getEra()
	 */
	public IsoEra getEra() {
		return deliveryDate.getEra();
	}
	/**
	 * @return
	 * @see java.time.LocalDate#getYear()
	 */
	public int getYear() {
		return deliveryDate.getYear();
	}
	/**
	 * @return
	 * @see java.time.LocalDate#getMonthValue()
	 */
	public int getMonthValue() {
		return deliveryDate.getMonthValue();
	}
	/**
	 * @return
	 * @see java.time.LocalDate#getMonth()
	 */
	public Month getMonth() {
		return deliveryDate.getMonth();
	}
	/**
	 * @return
	 * @see java.time.LocalDate#getDayOfMonth()
	 */
	public int getDayOfMonth() {
		return deliveryDate.getDayOfMonth();
	}
	/**
	 * @return
	 * @see java.time.LocalDate#getDayOfYear()
	 */
	public int getDayOfYear() {
		return deliveryDate.getDayOfYear();
	}
	/**
	 * @return
	 * @see java.time.LocalDate#getDayOfWeek()
	 */
	public DayOfWeek getDayOfWeek() {
		return deliveryDate.getDayOfWeek();
	}
	/**
	 * @return
	 * @see java.time.LocalDate#isLeapYear()
	 */
	public boolean isLeapYear() {
		return deliveryDate.isLeapYear();
	}
	/**
	 * @return
	 * @see java.time.LocalDate#lengthOfMonth()
	 */
	public int lengthOfMonth() {
		return deliveryDate.lengthOfMonth();
	}
	/**
	 * @return
	 * @see java.time.LocalDate#lengthOfYear()
	 */
	public int lengthOfYear() {
		return deliveryDate.lengthOfYear();
	}
	/**
	 * @param adjuster
	 * @return
	 * @see java.time.LocalDate#with(java.time.temporal.TemporalAdjuster)
	 */
	public LocalDate with(TemporalAdjuster adjuster) {
		return deliveryDate.with(adjuster);
	}
	/**
	 * @param field
	 * @param newValue
	 * @return
	 * @see java.time.LocalDate#with(java.time.temporal.TemporalField, long)
	 */
	public LocalDate with(TemporalField field, long newValue) {
		return deliveryDate.with(field, newValue);
	}
	/**
	 * @param year
	 * @return
	 * @see java.time.LocalDate#withYear(int)
	 */
	public LocalDate withYear(int year) {
		return deliveryDate.withYear(year);
	}
	/**
	 * @param month
	 * @return
	 * @see java.time.LocalDate#withMonth(int)
	 */
	public LocalDate withMonth(int month) {
		return deliveryDate.withMonth(month);
	}
	/**
	 * @param dayOfMonth
	 * @return
	 * @see java.time.LocalDate#withDayOfMonth(int)
	 */
	public LocalDate withDayOfMonth(int dayOfMonth) {
		return deliveryDate.withDayOfMonth(dayOfMonth);
	}
	/**
	 * @param dayOfYear
	 * @return
	 * @see java.time.LocalDate#withDayOfYear(int)
	 */
	public LocalDate withDayOfYear(int dayOfYear) {
		return deliveryDate.withDayOfYear(dayOfYear);
	}
	/**
	 * @param amountToAdd
	 * @return
	 * @see java.time.LocalDate#plus(java.time.temporal.TemporalAmount)
	 */
	public LocalDate plus(TemporalAmount amountToAdd) {
		return deliveryDate.plus(amountToAdd);
	}
	/**
	 * @param amountToAdd
	 * @param unit
	 * @return
	 * @see java.time.LocalDate#plus(long, java.time.temporal.TemporalUnit)
	 */
	public LocalDate plus(long amountToAdd, TemporalUnit unit) {
		return deliveryDate.plus(amountToAdd, unit);
	}
	/**
	 * @param yearsToAdd
	 * @return
	 * @see java.time.LocalDate#plusYears(long)
	 */
	public LocalDate plusYears(long yearsToAdd) {
		return deliveryDate.plusYears(yearsToAdd);
	}
	/**
	 * @param monthsToAdd
	 * @return
	 * @see java.time.LocalDate#plusMonths(long)
	 */
	public LocalDate plusMonths(long monthsToAdd) {
		return deliveryDate.plusMonths(monthsToAdd);
	}
	/**
	 * @param weeksToAdd
	 * @return
	 * @see java.time.LocalDate#plusWeeks(long)
	 */
	public LocalDate plusWeeks(long weeksToAdd) {
		return deliveryDate.plusWeeks(weeksToAdd);
	}
	/**
	 * @param daysToAdd
	 * @return
	 * @see java.time.LocalDate#plusDays(long)
	 */
	public LocalDate plusDays(long daysToAdd) {
		return deliveryDate.plusDays(daysToAdd);
	}
	/**
	 * @param amountToSubtract
	 * @return
	 * @see java.time.LocalDate#minus(java.time.temporal.TemporalAmount)
	 */
	public LocalDate minus(TemporalAmount amountToSubtract) {
		return deliveryDate.minus(amountToSubtract);
	}
	/**
	 * @param amountToSubtract
	 * @param unit
	 * @return
	 * @see java.time.LocalDate#minus(long, java.time.temporal.TemporalUnit)
	 */
	public LocalDate minus(long amountToSubtract, TemporalUnit unit) {
		return deliveryDate.minus(amountToSubtract, unit);
	}
	/**
	 * @param yearsToSubtract
	 * @return
	 * @see java.time.LocalDate#minusYears(long)
	 */
	public LocalDate minusYears(long yearsToSubtract) {
		return deliveryDate.minusYears(yearsToSubtract);
	}
	/**
	 * @param monthsToSubtract
	 * @return
	 * @see java.time.LocalDate#minusMonths(long)
	 */
	public LocalDate minusMonths(long monthsToSubtract) {
		return deliveryDate.minusMonths(monthsToSubtract);
	}
	/**
	 * @param weeksToSubtract
	 * @return
	 * @see java.time.LocalDate#minusWeeks(long)
	 */
	public LocalDate minusWeeks(long weeksToSubtract) {
		return deliveryDate.minusWeeks(weeksToSubtract);
	}
	/**
	 * @param daysToSubtract
	 * @return
	 * @see java.time.LocalDate#minusDays(long)
	 */
	public LocalDate minusDays(long daysToSubtract) {
		return deliveryDate.minusDays(daysToSubtract);
	}
	/**
	 * @param <R>
	 * @param query
	 * @return
	 * @see java.time.LocalDate#query(java.time.temporal.TemporalQuery)
	 */
	public <R> R query(TemporalQuery<R> query) {
		return deliveryDate.query(query);
	}
	/**
	 * @param temporal
	 * @return
	 * @see java.time.LocalDate#adjustInto(java.time.temporal.Temporal)
	 */
	public Temporal adjustInto(Temporal temporal) {
		return deliveryDate.adjustInto(temporal);
	}
	/**
	 * @param endExclusive
	 * @param unit
	 * @return
	 * @see java.time.LocalDate#until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)
	 */
	public long until(Temporal endExclusive, TemporalUnit unit) {
		return deliveryDate.until(endExclusive, unit);
	}
	/**
	 * @param endDateExclusive
	 * @return
	 * @see java.time.LocalDate#until(java.time.chrono.ChronoLocalDate)
	 */
	public Period until(ChronoLocalDate endDateExclusive) {
		return deliveryDate.until(endDateExclusive);
	}
	/**
	 * @param endExclusive
	 * @return
	 * @see java.time.LocalDate#datesUntil(java.time.LocalDate)
	 */
	public Stream<LocalDate> datesUntil(LocalDate endExclusive) {
		return deliveryDate.datesUntil(endExclusive);
	}
	/**
	 * @param endExclusive
	 * @param step
	 * @return
	 * @see java.time.LocalDate#datesUntil(java.time.LocalDate, java.time.Period)
	 */
	public Stream<LocalDate> datesUntil(LocalDate endExclusive, Period step) {
		return deliveryDate.datesUntil(endExclusive, step);
	}
	/**
	 * @param formatter
	 * @return
	 * @see java.time.LocalDate#format(java.time.format.DateTimeFormatter)
	 */
	public String format(DateTimeFormatter formatter) {
		return deliveryDate.format(formatter);
	}
	/**
	 * @param time
	 * @return
	 * @see java.time.LocalDate#atTime(java.time.LocalTime)
	 */
	public LocalDateTime atTime(LocalTime time) {
		return deliveryDate.atTime(time);
	}
	/**
	 * @param hour
	 * @param minute
	 * @return
	 * @see java.time.LocalDate#atTime(int, int)
	 */
	public LocalDateTime atTime(int hour, int minute) {
		return deliveryDate.atTime(hour, minute);
	}
	/**
	 * @param hour
	 * @param minute
	 * @param second
	 * @return
	 * @see java.time.LocalDate#atTime(int, int, int)
	 */
	public LocalDateTime atTime(int hour, int minute, int second) {
		return deliveryDate.atTime(hour, minute, second);
	}
	/**
	 * @param hour
	 * @param minute
	 * @param second
	 * @param nanoOfSecond
	 * @return
	 * @see java.time.LocalDate#atTime(int, int, int, int)
	 */
	public LocalDateTime atTime(int hour, int minute, int second, int nanoOfSecond) {
		return deliveryDate.atTime(hour, minute, second, nanoOfSecond);
	}
	/**
	 * @param time
	 * @return
	 * @see java.time.LocalDate#atTime(java.time.OffsetTime)
	 */
	public OffsetDateTime atTime(OffsetTime time) {
		return deliveryDate.atTime(time);
	}
	/**
	 * @return
	 * @see java.time.LocalDate#atStartOfDay()
	 */
	public LocalDateTime atStartOfDay() {
		return deliveryDate.atStartOfDay();
	}
	/**
	 * @param zone
	 * @return
	 * @see java.time.LocalDate#atStartOfDay(java.time.ZoneId)
	 */
	public ZonedDateTime atStartOfDay(ZoneId zone) {
		return deliveryDate.atStartOfDay(zone);
	}
	/**
	 * @return
	 * @see java.time.LocalDate#toEpochDay()
	 */
	public long toEpochDay() {
		return deliveryDate.toEpochDay();
	}
	/**
	 * @param time
	 * @param offset
	 * @return
	 * @see java.time.LocalDate#toEpochSecond(java.time.LocalTime, java.time.ZoneOffset)
	 */
	public long toEpochSecond(LocalTime time, ZoneOffset offset) {
		return deliveryDate.toEpochSecond(time, offset);
	}
	/**
	 * @param other
	 * @return
	 * @see java.time.LocalDate#compareTo(java.time.chrono.ChronoLocalDate)
	 */
	public int compareTo(ChronoLocalDate other) {
		return deliveryDate.compareTo(other);
	}
	/**
	 * @param other
	 * @return
	 * @see java.time.LocalDate#isAfter(java.time.chrono.ChronoLocalDate)
	 */
	public boolean isAfter(ChronoLocalDate other) {
		return deliveryDate.isAfter(other);
	}
	/**
	 * @param other
	 * @return
	 * @see java.time.LocalDate#isBefore(java.time.chrono.ChronoLocalDate)
	 */
	public boolean isBefore(ChronoLocalDate other) {
		return deliveryDate.isBefore(other);
	}
	/**
	 * @param other
	 * @return
	 * @see java.time.LocalDate#isEqual(java.time.chrono.ChronoLocalDate)
	 */
	public boolean isEqual(ChronoLocalDate other) {
		return deliveryDate.isEqual(other);
	}
	/**
	 * @param obj
	 * @return
	 * @see java.time.LocalDate#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		return deliveryDate.equals(obj);
	}
	/**
	 * @return
	 * @see java.time.LocalDate#hashCode()
	 */
	public int hashCode() {
		return deliveryDate.hashCode();
	}


}
