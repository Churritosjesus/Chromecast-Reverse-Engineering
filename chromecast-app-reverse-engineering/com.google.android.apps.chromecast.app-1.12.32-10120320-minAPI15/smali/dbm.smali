.class public final Ldbm;
.super Ldew;
.source "PG"


# instance fields
.field public a:[Ldbk;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Ldew;-><init>()V

    .line 27
    invoke-static {}, Ldbk;->b()[Ldbk;

    move-result-object v0

    iput-object v0, p0, Ldbm;->a:[Ldbk;

    .line 28
    const/4 v0, -0x1

    iput v0, p0, Ldbm;->t:I

    .line 29
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 4

    .prologue
    .line 47
    invoke-super {p0}, Ldew;->a()I

    move-result v1

    .line 48
    iget-object v0, p0, Ldbm;->a:[Ldbk;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldbm;->a:[Ldbk;

    array-length v0, v0

    if-lez v0, :cond_1

    .line 49
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Ldbm;->a:[Ldbk;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 50
    iget-object v2, p0, Ldbm;->a:[Ldbk;

    aget-object v2, v2, v0

    .line 51
    if-eqz v2, :cond_0

    .line 52
    const/4 v3, 0x1

    .line 53
    invoke-static {v3, v2}, Ldep;->b(ILdew;)I

    move-result v2

    add-int/2addr v1, v2

    .line 49
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 57
    :cond_1
    return v1
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5
    .line 1065
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1066
    sparse-switch v0, :sswitch_data_0

    .line 1070
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1071
    :sswitch_0
    return-object p0

    .line 1076
    :sswitch_1
    const/16 v0, 0xa

    .line 1077
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 1078
    iget-object v0, p0, Ldbm;->a:[Ldbk;

    if-nez v0, :cond_2

    move v0, v1

    .line 1079
    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ldbk;

    .line 1081
    if-eqz v0, :cond_1

    .line 1082
    iget-object v3, p0, Ldbm;->a:[Ldbk;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1084
    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    .line 1085
    new-instance v3, Ldbk;

    invoke-direct {v3}, Ldbk;-><init>()V

    aput-object v3, v2, v0

    .line 1086
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ldeo;->a(Ldew;)V

    .line 1087
    invoke-virtual {p1}, Ldeo;->a()I

    .line 1084
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1078
    :cond_2
    iget-object v0, p0, Ldbm;->a:[Ldbk;

    array-length v0, v0

    goto :goto_1

    .line 1090
    :cond_3
    new-instance v3, Ldbk;

    invoke-direct {v3}, Ldbk;-><init>()V

    aput-object v3, v2, v0

    .line 1091
    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    .line 1092
    iput-object v2, p0, Ldbm;->a:[Ldbk;

    goto :goto_0

    .line 1066
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 3

    .prologue
    .line 34
    iget-object v0, p0, Ldbm;->a:[Ldbk;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldbm;->a:[Ldbk;

    array-length v0, v0

    if-lez v0, :cond_1

    .line 35
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ldbm;->a:[Ldbk;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 36
    iget-object v1, p0, Ldbm;->a:[Ldbk;

    aget-object v1, v1, v0

    .line 37
    if-eqz v1, :cond_0

    .line 38
    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Ldep;->a(ILdew;)V

    .line 35
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 42
    :cond_1
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 43
    return-void
.end method
