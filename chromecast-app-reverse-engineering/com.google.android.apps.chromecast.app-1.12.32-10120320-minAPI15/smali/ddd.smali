.class public final Lddd;
.super Lder;
.source "PG"


# instance fields
.field private a:[Ldda;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 999
    invoke-direct {p0}, Lder;-><init>()V

    .line 1000
    invoke-static {}, Ldda;->b()[Ldda;

    move-result-object v0

    iput-object v0, p0, Lddd;->a:[Ldda;

    .line 1001
    const/4 v0, 0x0

    iput-object v0, p0, Lddd;->i:Ldes;

    .line 1002
    const/4 v0, -0x1

    iput v0, p0, Lddd;->t:I

    .line 1003
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 4

    .prologue
    .line 1021
    invoke-super {p0}, Lder;->a()I

    move-result v1

    .line 1022
    iget-object v0, p0, Lddd;->a:[Ldda;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lddd;->a:[Ldda;

    array-length v0, v0

    if-lez v0, :cond_1

    .line 1023
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lddd;->a:[Ldda;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 1024
    iget-object v2, p0, Lddd;->a:[Ldda;

    aget-object v2, v2, v0

    .line 1025
    if-eqz v2, :cond_0

    .line 1026
    const/4 v3, 0x1

    .line 1027
    invoke-static {v3, v2}, Ldep;->b(ILdew;)I

    move-result v2

    add-int/2addr v1, v2

    .line 1023
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1031
    :cond_1
    return v1
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 979
    .line 2039
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 2040
    sparse-switch v0, :sswitch_data_0

    .line 2044
    invoke-super {p0, p1, v0}, Lder;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2045
    :sswitch_0
    return-object p0

    .line 2050
    :sswitch_1
    const/16 v0, 0xa

    .line 2051
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 2052
    iget-object v0, p0, Lddd;->a:[Ldda;

    if-nez v0, :cond_2

    move v0, v1

    .line 2053
    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ldda;

    .line 2055
    if-eqz v0, :cond_1

    .line 2056
    iget-object v3, p0, Lddd;->a:[Ldda;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2058
    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    .line 2059
    new-instance v3, Ldda;

    invoke-direct {v3}, Ldda;-><init>()V

    aput-object v3, v2, v0

    .line 2060
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ldeo;->a(Ldew;)V

    .line 2061
    invoke-virtual {p1}, Ldeo;->a()I

    .line 2058
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 2052
    :cond_2
    iget-object v0, p0, Lddd;->a:[Ldda;

    array-length v0, v0

    goto :goto_1

    .line 2064
    :cond_3
    new-instance v3, Ldda;

    invoke-direct {v3}, Ldda;-><init>()V

    aput-object v3, v2, v0

    .line 2065
    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    .line 2066
    iput-object v2, p0, Lddd;->a:[Ldda;

    goto :goto_0

    .line 2040
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 3

    .prologue
    .line 1008
    iget-object v0, p0, Lddd;->a:[Ldda;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lddd;->a:[Ldda;

    array-length v0, v0

    if-lez v0, :cond_1

    .line 1009
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lddd;->a:[Ldda;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 1010
    iget-object v1, p0, Lddd;->a:[Ldda;

    aget-object v1, v1, v0

    .line 1011
    if-eqz v1, :cond_0

    .line 1012
    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Ldep;->a(ILdew;)V

    .line 1009
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1016
    :cond_1
    invoke-super {p0, p1}, Lder;->a(Ldep;)V

    .line 1017
    return-void
.end method
