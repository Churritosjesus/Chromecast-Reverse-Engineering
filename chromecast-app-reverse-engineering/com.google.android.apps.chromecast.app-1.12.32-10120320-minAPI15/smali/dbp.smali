.class public final Ldbp;
.super Ldew;
.source "PG"


# instance fields
.field public a:[Ldbf;

.field private b:Ldbb;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ldew;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Ldbp;->b:Ldbb;

    .line 31
    invoke-static {}, Ldbf;->b()[Ldbf;

    move-result-object v0

    iput-object v0, p0, Ldbp;->a:[Ldbf;

    .line 32
    const/4 v0, -0x1

    iput v0, p0, Ldbp;->t:I

    .line 33
    return-void
.end method

.method public static a([B)Ldbp;
    .locals 1

    .prologue
    .line 119
    new-instance v0, Ldbp;

    invoke-direct {v0}, Ldbp;-><init>()V

    invoke-static {v0, p0}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldbp;

    return-object v0
.end method


# virtual methods
.method protected final a()I
    .locals 5

    .prologue
    .line 54
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 55
    iget-object v1, p0, Ldbp;->b:Ldbb;

    if-eqz v1, :cond_0

    .line 56
    const/4 v1, 0x1

    iget-object v2, p0, Ldbp;->b:Ldbb;

    .line 57
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 59
    :cond_0
    iget-object v1, p0, Ldbp;->a:[Ldbf;

    if-eqz v1, :cond_3

    iget-object v1, p0, Ldbp;->a:[Ldbf;

    array-length v1, v1

    if-lez v1, :cond_3

    .line 60
    const/4 v1, 0x0

    move v4, v1

    move v1, v0

    move v0, v4

    :goto_0
    iget-object v2, p0, Ldbp;->a:[Ldbf;

    array-length v2, v2

    if-ge v0, v2, :cond_2

    .line 61
    iget-object v2, p0, Ldbp;->a:[Ldbf;

    aget-object v2, v2, v0

    .line 62
    if-eqz v2, :cond_1

    .line 63
    const/4 v3, 0x2

    .line 64
    invoke-static {v3, v2}, Ldep;->b(ILdew;)I

    move-result v2

    add-int/2addr v1, v2

    .line 60
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 68
    :cond_3
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5
    .line 1076
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1077
    sparse-switch v0, :sswitch_data_0

    .line 1081
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1082
    :sswitch_0
    return-object p0

    .line 1087
    :sswitch_1
    iget-object v0, p0, Ldbp;->b:Ldbb;

    if-nez v0, :cond_1

    .line 1088
    new-instance v0, Ldbb;

    invoke-direct {v0}, Ldbb;-><init>()V

    iput-object v0, p0, Ldbp;->b:Ldbb;

    .line 1090
    :cond_1
    iget-object v0, p0, Ldbp;->b:Ldbb;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1094
    :sswitch_2
    const/16 v0, 0x12

    .line 1095
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 1096
    iget-object v0, p0, Ldbp;->a:[Ldbf;

    if-nez v0, :cond_3

    move v0, v1

    .line 1097
    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ldbf;

    .line 1099
    if-eqz v0, :cond_2

    .line 1100
    iget-object v3, p0, Ldbp;->a:[Ldbf;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1102
    :cond_2
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_4

    .line 1103
    new-instance v3, Ldbf;

    invoke-direct {v3}, Ldbf;-><init>()V

    aput-object v3, v2, v0

    .line 1104
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ldeo;->a(Ldew;)V

    .line 1105
    invoke-virtual {p1}, Ldeo;->a()I

    .line 1102
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1096
    :cond_3
    iget-object v0, p0, Ldbp;->a:[Ldbf;

    array-length v0, v0

    goto :goto_1

    .line 1108
    :cond_4
    new-instance v3, Ldbf;

    invoke-direct {v3}, Ldbf;-><init>()V

    aput-object v3, v2, v0

    .line 1109
    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    .line 1110
    iput-object v2, p0, Ldbp;->a:[Ldbf;

    goto :goto_0

    .line 1077
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
    iget-object v0, p0, Ldbp;->b:Ldbb;

    if-eqz v0, :cond_0

    .line 39
    const/4 v0, 0x1

    iget-object v1, p0, Ldbp;->b:Ldbb;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 41
    :cond_0
    iget-object v0, p0, Ldbp;->a:[Ldbf;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ldbp;->a:[Ldbf;

    array-length v0, v0

    if-lez v0, :cond_2

    .line 42
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ldbp;->a:[Ldbf;

    array-length v1, v1

    if-ge v0, v1, :cond_2

    .line 43
    iget-object v1, p0, Ldbp;->a:[Ldbf;

    aget-object v1, v1, v0

    .line 44
    if-eqz v1, :cond_1

    .line 45
    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, Ldep;->a(ILdew;)V

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
