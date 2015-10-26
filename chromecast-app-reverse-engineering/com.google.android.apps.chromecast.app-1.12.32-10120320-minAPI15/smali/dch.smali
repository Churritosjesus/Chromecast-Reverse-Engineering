.class public final Ldch;
.super Ldew;
.source "PG"


# instance fields
.field public a:[Ljava/lang/String;

.field private b:[Ldbv;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ldew;-><init>()V

    .line 1034
    sget-object v0, Ldey;->b:[Ljava/lang/String;

    iput-object v0, p0, Ldch;->a:[Ljava/lang/String;

    .line 1035
    invoke-static {}, Ldbv;->b()[Ldbv;

    move-result-object v0

    iput-object v0, p0, Ldch;->b:[Ldbv;

    .line 1036
    const/4 v0, -0x1

    iput v0, p0, Ldch;->t:I

    .line 31
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 64
    invoke-super {p0}, Ldew;->a()I

    move-result v4

    .line 65
    iget-object v0, p0, Ldch;->a:[Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Ldch;->a:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_4

    move v0, v1

    move v2, v1

    move v3, v1

    .line 68
    :goto_0
    iget-object v5, p0, Ldch;->a:[Ljava/lang/String;

    array-length v5, v5

    if-ge v0, v5, :cond_1

    .line 69
    iget-object v5, p0, Ldch;->a:[Ljava/lang/String;

    aget-object v5, v5, v0

    .line 70
    if-eqz v5, :cond_0

    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 73
    invoke-static {v5}, Ldep;->a(Ljava/lang/String;)I

    move-result v5

    add-int/2addr v2, v5

    .line 68
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 76
    :cond_1
    add-int v0, v4, v2

    .line 77
    mul-int/lit8 v2, v3, 0x1

    add-int/2addr v0, v2

    .line 79
    :goto_1
    iget-object v2, p0, Ldch;->b:[Ldbv;

    if-eqz v2, :cond_3

    iget-object v2, p0, Ldch;->b:[Ldbv;

    array-length v2, v2

    if-lez v2, :cond_3

    .line 80
    :goto_2
    iget-object v2, p0, Ldch;->b:[Ldbv;

    array-length v2, v2

    if-ge v1, v2, :cond_3

    .line 81
    iget-object v2, p0, Ldch;->b:[Ldbv;

    aget-object v2, v2, v1

    .line 82
    if-eqz v2, :cond_2

    .line 83
    const/4 v3, 0x2

    .line 84
    invoke-static {v3, v2}, Ldep;->b(ILdew;)I

    move-result v2

    add-int/2addr v0, v2

    .line 80
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 88
    :cond_3
    return v0

    :cond_4
    move v0, v4

    goto :goto_1
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5
    .line 1096
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1097
    sparse-switch v0, :sswitch_data_0

    .line 1101
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1102
    :sswitch_0
    return-object p0

    .line 1107
    :sswitch_1
    const/16 v0, 0xa

    .line 1108
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 1109
    iget-object v0, p0, Ldch;->a:[Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v1

    .line 1110
    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ljava/lang/String;

    .line 1111
    if-eqz v0, :cond_1

    .line 1112
    iget-object v3, p0, Ldch;->a:[Ljava/lang/String;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1114
    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    .line 1115
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    .line 1116
    invoke-virtual {p1}, Ldeo;->a()I

    .line 1114
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1109
    :cond_2
    iget-object v0, p0, Ldch;->a:[Ljava/lang/String;

    array-length v0, v0

    goto :goto_1

    .line 1119
    :cond_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    .line 1120
    iput-object v2, p0, Ldch;->a:[Ljava/lang/String;

    goto :goto_0

    .line 1124
    :sswitch_2
    const/16 v0, 0x12

    .line 1125
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 1126
    iget-object v0, p0, Ldch;->b:[Ldbv;

    if-nez v0, :cond_5

    move v0, v1

    .line 1127
    :goto_3
    add-int/2addr v2, v0

    new-array v2, v2, [Ldbv;

    .line 1129
    if-eqz v0, :cond_4

    .line 1130
    iget-object v3, p0, Ldch;->b:[Ldbv;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1132
    :cond_4
    :goto_4
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_6

    .line 1133
    new-instance v3, Ldbv;

    invoke-direct {v3}, Ldbv;-><init>()V

    aput-object v3, v2, v0

    .line 1134
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ldeo;->a(Ldew;)V

    .line 1135
    invoke-virtual {p1}, Ldeo;->a()I

    .line 1132
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 1126
    :cond_5
    iget-object v0, p0, Ldch;->b:[Ldbv;

    array-length v0, v0

    goto :goto_3

    .line 1138
    :cond_6
    new-instance v3, Ldbv;

    invoke-direct {v3}, Ldbv;-><init>()V

    aput-object v3, v2, v0

    .line 1139
    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    .line 1140
    iput-object v2, p0, Ldch;->b:[Ldbv;

    goto :goto_0

    .line 1097
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 43
    iget-object v0, p0, Ldch;->a:[Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldch;->a:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_1

    move v0, v1

    .line 44
    :goto_0
    iget-object v2, p0, Ldch;->a:[Ljava/lang/String;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 45
    iget-object v2, p0, Ldch;->a:[Ljava/lang/String;

    aget-object v2, v2, v0

    .line 46
    if-eqz v2, :cond_0

    .line 47
    const/4 v3, 0x1

    invoke-virtual {p1, v3, v2}, Ldep;->a(ILjava/lang/String;)V

    .line 44
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 51
    :cond_1
    iget-object v0, p0, Ldch;->b:[Ldbv;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ldch;->b:[Ldbv;

    array-length v0, v0

    if-lez v0, :cond_3

    .line 52
    :goto_1
    iget-object v0, p0, Ldch;->b:[Ldbv;

    array-length v0, v0

    if-ge v1, v0, :cond_3

    .line 53
    iget-object v0, p0, Ldch;->b:[Ldbv;

    aget-object v0, v0, v1

    .line 54
    if-eqz v0, :cond_2

    .line 55
    const/4 v2, 0x2

    invoke-virtual {p1, v2, v0}, Ldep;->a(ILdew;)V

    .line 52
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 59
    :cond_3
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 60
    return-void
.end method
