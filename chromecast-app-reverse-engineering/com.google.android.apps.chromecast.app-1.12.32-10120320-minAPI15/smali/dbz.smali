.class public final Ldbz;
.super Ldew;
.source "PG"


# instance fields
.field public a:[Ldbq;

.field public b:Ljava/lang/String;

.field private c:Ljava/lang/Integer;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 38
    invoke-direct {p0}, Ldew;-><init>()V

    .line 1043
    iput-object v1, p0, Ldbz;->c:Ljava/lang/Integer;

    .line 1044
    invoke-static {}, Ldbq;->b()[Ldbq;

    move-result-object v0

    iput-object v0, p0, Ldbz;->a:[Ldbq;

    .line 1045
    iput-object v1, p0, Ldbz;->b:Ljava/lang/String;

    .line 1046
    iput-object v1, p0, Ldbz;->d:Ljava/lang/String;

    .line 1047
    iput-object v1, p0, Ldbz;->e:Ljava/lang/Boolean;

    .line 1048
    const/4 v0, -0x1

    iput v0, p0, Ldbz;->t:I

    .line 40
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 5

    .prologue
    .line 80
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 81
    iget-object v1, p0, Ldbz;->c:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 82
    const/4 v1, 0x1

    iget-object v2, p0, Ldbz;->c:Ljava/lang/Integer;

    .line 83
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 85
    :cond_0
    iget-object v1, p0, Ldbz;->a:[Ldbq;

    if-eqz v1, :cond_3

    iget-object v1, p0, Ldbz;->a:[Ldbq;

    array-length v1, v1

    if-lez v1, :cond_3

    .line 86
    const/4 v1, 0x0

    move v4, v1

    move v1, v0

    move v0, v4

    :goto_0
    iget-object v2, p0, Ldbz;->a:[Ldbq;

    array-length v2, v2

    if-ge v0, v2, :cond_2

    .line 87
    iget-object v2, p0, Ldbz;->a:[Ldbq;

    aget-object v2, v2, v0

    .line 88
    if-eqz v2, :cond_1

    .line 89
    const/4 v3, 0x2

    .line 90
    invoke-static {v3, v2}, Ldep;->b(ILdew;)I

    move-result v2

    add-int/2addr v1, v2

    .line 86
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 94
    :cond_3
    iget-object v1, p0, Ldbz;->b:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 95
    const/4 v1, 0x3

    iget-object v2, p0, Ldbz;->b:Ljava/lang/String;

    .line 96
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 98
    :cond_4
    iget-object v1, p0, Ldbz;->d:Ljava/lang/String;

    if-eqz v1, :cond_5

    .line 99
    const/4 v1, 0x4

    iget-object v2, p0, Ldbz;->d:Ljava/lang/String;

    .line 100
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 102
    :cond_5
    iget-object v1, p0, Ldbz;->e:Ljava/lang/Boolean;

    if-eqz v1, :cond_6

    .line 103
    const/4 v1, 0x5

    iget-object v2, p0, Ldbz;->e:Ljava/lang/Boolean;

    .line 104
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1620
    invoke-static {v1}, Ldep;->b(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 104
    add-int/2addr v0, v1

    .line 106
    :cond_6
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5
    .line 2114
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 2115
    sparse-switch v0, :sswitch_data_0

    .line 2119
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2120
    :sswitch_0
    return-object p0

    .line 2169
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 2125
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldbz;->c:Ljava/lang/Integer;

    goto :goto_0

    .line 2129
    :sswitch_2
    const/16 v0, 0x12

    .line 2130
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 2131
    iget-object v0, p0, Ldbz;->a:[Ldbq;

    if-nez v0, :cond_2

    move v0, v1

    .line 2132
    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ldbq;

    .line 2134
    if-eqz v0, :cond_1

    .line 2135
    iget-object v3, p0, Ldbz;->a:[Ldbq;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2137
    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    .line 2138
    new-instance v3, Ldbq;

    invoke-direct {v3}, Ldbq;-><init>()V

    aput-object v3, v2, v0

    .line 2139
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ldeo;->a(Ldew;)V

    .line 2140
    invoke-virtual {p1}, Ldeo;->a()I

    .line 2137
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 2131
    :cond_2
    iget-object v0, p0, Ldbz;->a:[Ldbq;

    array-length v0, v0

    goto :goto_1

    .line 2143
    :cond_3
    new-instance v3, Ldbq;

    invoke-direct {v3}, Ldbq;-><init>()V

    aput-object v3, v2, v0

    .line 2144
    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    .line 2145
    iput-object v2, p0, Ldbz;->a:[Ldbq;

    goto :goto_0

    .line 2149
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbz;->b:Ljava/lang/String;

    goto :goto_0

    .line 2153
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbz;->d:Ljava/lang/String;

    goto :goto_0

    .line 2157
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ldbz;->e:Ljava/lang/Boolean;

    goto :goto_0

    .line 2115
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x28 -> :sswitch_5
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 3

    .prologue
    .line 55
    iget-object v0, p0, Ldbz;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 56
    const/4 v0, 0x1

    iget-object v1, p0, Ldbz;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 58
    :cond_0
    iget-object v0, p0, Ldbz;->a:[Ldbq;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ldbz;->a:[Ldbq;

    array-length v0, v0

    if-lez v0, :cond_2

    .line 59
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ldbz;->a:[Ldbq;

    array-length v1, v1

    if-ge v0, v1, :cond_2

    .line 60
    iget-object v1, p0, Ldbz;->a:[Ldbq;

    aget-object v1, v1, v0

    .line 61
    if-eqz v1, :cond_1

    .line 62
    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, Ldep;->a(ILdew;)V

    .line 59
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 66
    :cond_2
    iget-object v0, p0, Ldbz;->b:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 67
    const/4 v0, 0x3

    iget-object v1, p0, Ldbz;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 69
    :cond_3
    iget-object v0, p0, Ldbz;->d:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 70
    const/4 v0, 0x4

    iget-object v1, p0, Ldbz;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 72
    :cond_4
    iget-object v0, p0, Ldbz;->e:Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    .line 73
    const/4 v0, 0x5

    iget-object v1, p0, Ldbz;->e:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(IZ)V

    .line 75
    :cond_5
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 76
    return-void
.end method
