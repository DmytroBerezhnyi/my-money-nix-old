package com.xinosluitsnoi.mymoney.domain.entity;

import java.lang.annotation.Retention;

import androidx.annotation.ColorInt;
import androidx.annotation.IntDef;
import androidx.annotation.NonNull;

import java.lang.annotation.RetentionPolicy;

public class Category {

    private long id;

    private String title;

    @ColorInt
    private int color;

    @Type.Mode
    private int type;

    public Category() {
    }

    public Category(long id) {
        this.id = id;
    }

    public Category(@NonNull String title, @ColorInt int color, @Type.Mode int type) {
        this.title = title;
        this.color = color;
        this.type = type;
    }

    public Category(long id, @NonNull String title, @ColorInt int color, @Type.Mode int type) {
        this.id = id;
        this.title = title;
        this.color = color;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    @ColorInt
    public int getColor() {
        return color;
    }

    public void setColor(@ColorInt int color) {
        this.color = color;
    }

    @Type.Mode
    public int getType() {
        return type;
    }

    public void setType(@Type.Mode int type) {
        this.type = type;
    }

    public static class Type {

        @Retention(RetentionPolicy.SOURCE)
        @IntDef({
                        Mode.ALL,
                        Mode.INCOME,
                        Mode.CONSUME,
                })
        public @interface Mode {

            int ALL = 0;

            int INCOME = 1;

            int CONSUME = 2;
        }
    }
}