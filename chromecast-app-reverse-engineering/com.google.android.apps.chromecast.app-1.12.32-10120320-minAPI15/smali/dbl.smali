.class public final Ldbl;
.super Ldew;
.source "PG"


# instance fields
.field public a:Ldax;

.field public b:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ldew;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Ldbl;->a:Ldax;

    .line 31
    sget-object v0, Ldey;->b:[Ljava/lang/String;

    iput-object v0, p0, Ldbl;->b:[Ljava/lang/String;

    .line 32
    const/4 v0, -0x1

    iput v0, p0, Ldbl;->t:I

    .line 33
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 54
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 55
    iget-object v2, p0, Ldbl;->a:Ldax;

    if-eqz v2, :cond_0

    .line 56
    const/4 v2, 0x1

    iget-object v3, p0, Ldbl;->a:Ldax;

    .line 57
    invoke-static {v2, v3}, Ldep;->b(ILdew;)I

    move-result v2

    add-int/2addr v0, v2

    .line 59
    :cond_0
    iget-object v2, p0, Ldbl;->b:[Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v2, p0, Ldbl;->b:[Ljava/lang/String;

    array-length v2, v2

    if-lez v2, :cond_3

    move v2, v1

    move v3, v1

    .line 62
    :goto_0
    iget-object v4, p0, Ldbl;->b:[Ljava/lang/String;

    array-length v4, v4

    if-ge v1, v4, :cond_2

    .line 63
    iget-object v4, p0, Ldbl;->b:[Ljava/lang/String;

    aget-object v4, v4, v1

    .line 64
    if-eqz v4, :cond_1

    .line 65
    add-int/lit8 v3, v3, 0x1

    .line 67
    invoke-static {v4}, Ldep;->a(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v2, v4

    .line 62
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 70
    :cond_2
    add-int/2addr v0, v2

    .line 71
    mul-int/lit8 v1, v3, 0x1

    add-int/2addr v0, v1

    .line 73
    :cond_3
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5
    .line 1081
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1082
    sparse-switch v0, :sswitch_data_0

    .line 1086
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1087
    :sswitch_0
    return-object p0

    .line 1092
    :sswitch_1
    iget-object v0, p0, Ldbl;->a:Ldax;

    if-nez v0, :cond_1

    .line 1093
    new-instance v0, Ldax;

    invoke-direct {v0}, Ldax;-><init>()V

    iput-object v0, p0, Ldbl;->a:Ldax;

    .line 1095
    :cond_1
    iget-object v0, p0, Ldbl;->a:Ldax;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1099
    :sswitch_2
    const/16 v0, 0x12

    .line 1100
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 1101
    iget-object v0, p0, Ldbl;->b:[Ljava/lang/String;

    if-nez v0, :cond_3

    move v0, v1

    .line 1102
    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ljava/lang/String;

    .line 1103
    if-eqz v0, :cond_2

    .line 1104
    iget-object v3, p0, Ldbl;->b:[Ljava/lang/String;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1106
    :cond_2
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_4

    .line 1107
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    .line 1108
    invoke-virtual {p1}, Ldeo;->a()I

    .line 1106
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1101
    :cond_3
    iget-object v0, p0, Ldbl;->b:[Ljava/lang/String;

    array-length v0, v0

    goto :goto_1

    .line 1111
    :cond_4
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    .line 1112
    iput-object v2, p0, Ldbl;->b:[Ljava/lang/String;

    goto :goto_0

    .line 1082
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 3

    .prologue
    .line 38
    iget-object v0, p0, Ldbl;->a:Ldax;

    if-eqz v0, :cond_0

    .line 39
    const/4 v0, 0x1

    iget-object v1, p0, Ldbl;->a:Ldax;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 41
    :cond_0
    iget-object v0, p0, Ldbl;->b:[Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ldbl;->b:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_2

    .line 42
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ldbl;->b:[Ljava/lang/String;

    array-length v1, v1

    if-ge v0, v1, :cond_2

    .line 43
    iget-object v1, p0, Ldbl;->b:[Ljava/lang/String;

    aget-object v1, v1, v0

    .line 44
    if-eqz v1, :cond_1

    .line 45
    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 42
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 49
    :cond_2
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 50
    return-void
.end method
