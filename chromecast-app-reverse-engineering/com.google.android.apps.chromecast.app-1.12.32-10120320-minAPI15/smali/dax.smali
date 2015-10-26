.class public final Ldax;
.super Ldew;
.source "PG"


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:[Ljava/lang/String;

.field public c:I

.field public d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 38
    invoke-direct {p0}, Ldew;-><init>()V

    .line 39
    iput-object v1, p0, Ldax;->a:Ljava/lang/Integer;

    .line 40
    sget-object v0, Ldey;->b:[Ljava/lang/String;

    iput-object v0, p0, Ldax;->b:[Ljava/lang/String;

    .line 41
    const/high16 v0, -0x80000000

    iput v0, p0, Ldax;->c:I

    .line 42
    iput-object v1, p0, Ldax;->d:Ljava/lang/String;

    .line 43
    iput-object v1, p0, Ldax;->e:Ljava/lang/String;

    .line 44
    const/4 v0, -0x1

    iput v0, p0, Ldax;->t:I

    .line 45
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 75
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 76
    iget-object v2, p0, Ldax;->a:Ljava/lang/Integer;

    if-eqz v2, :cond_0

    .line 77
    const/4 v2, 0x1

    iget-object v3, p0, Ldax;->a:Ljava/lang/Integer;

    .line 78
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v2, v3}, Ldep;->b(II)I

    move-result v2

    add-int/2addr v0, v2

    .line 80
    :cond_0
    iget-object v2, p0, Ldax;->b:[Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v2, p0, Ldax;->b:[Ljava/lang/String;

    array-length v2, v2

    if-lez v2, :cond_3

    move v2, v1

    move v3, v1

    .line 83
    :goto_0
    iget-object v4, p0, Ldax;->b:[Ljava/lang/String;

    array-length v4, v4

    if-ge v1, v4, :cond_2

    .line 84
    iget-object v4, p0, Ldax;->b:[Ljava/lang/String;

    aget-object v4, v4, v1

    .line 85
    if-eqz v4, :cond_1

    .line 86
    add-int/lit8 v3, v3, 0x1

    .line 88
    invoke-static {v4}, Ldep;->a(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v2, v4

    .line 83
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 91
    :cond_2
    add-int/2addr v0, v2

    .line 92
    mul-int/lit8 v1, v3, 0x1

    add-int/2addr v0, v1

    .line 94
    :cond_3
    iget v1, p0, Ldax;->c:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_4

    .line 95
    const/4 v1, 0x3

    iget v2, p0, Ldax;->c:I

    .line 96
    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 98
    :cond_4
    iget-object v1, p0, Ldax;->d:Ljava/lang/String;

    if-eqz v1, :cond_5

    .line 99
    const/4 v1, 0x4

    iget-object v2, p0, Ldax;->d:Ljava/lang/String;

    .line 100
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 102
    :cond_5
    iget-object v1, p0, Ldax;->e:Ljava/lang/String;

    if-eqz v1, :cond_6

    .line 103
    const/4 v1, 0x5

    iget-object v2, p0, Ldax;->e:Ljava/lang/String;

    .line 104
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

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
    .line 1114
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1115
    sparse-switch v0, :sswitch_data_0

    .line 1119
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1120
    :sswitch_0
    return-object p0

    .line 1169
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1125
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldax;->a:Ljava/lang/Integer;

    goto :goto_0

    .line 1129
    :sswitch_2
    const/16 v0, 0x12

    .line 1130
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 1131
    iget-object v0, p0, Ldax;->b:[Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v1

    .line 1132
    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ljava/lang/String;

    .line 1133
    if-eqz v0, :cond_1

    .line 1134
    iget-object v3, p0, Ldax;->b:[Ljava/lang/String;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1136
    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    .line 1137
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    .line 1138
    invoke-virtual {p1}, Ldeo;->a()I

    .line 1136
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1131
    :cond_2
    iget-object v0, p0, Ldax;->b:[Ljava/lang/String;

    array-length v0, v0

    goto :goto_1

    .line 1141
    :cond_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    .line 1142
    iput-object v2, p0, Ldax;->b:[Ljava/lang/String;

    goto :goto_0

    .line 2169
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1147
    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 1152
    :pswitch_1
    iput v0, p0, Ldax;->c:I

    goto :goto_0

    .line 1158
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldax;->d:Ljava/lang/String;

    goto :goto_0

    .line 1162
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldax;->e:Ljava/lang/String;

    goto :goto_0

    .line 1115
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
        0x18 -> :sswitch_3
        0x22 -> :sswitch_4
        0x2a -> :sswitch_5
    .end sparse-switch

    .line 1147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Ldep;)V
    .locals 3

    .prologue
    .line 50
    iget-object v0, p0, Ldax;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 51
    const/4 v0, 0x1

    iget-object v1, p0, Ldax;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 53
    :cond_0
    iget-object v0, p0, Ldax;->b:[Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ldax;->b:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_2

    .line 54
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ldax;->b:[Ljava/lang/String;

    array-length v1, v1

    if-ge v0, v1, :cond_2

    .line 55
    iget-object v1, p0, Ldax;->b:[Ljava/lang/String;

    aget-object v1, v1, v0

    .line 56
    if-eqz v1, :cond_1

    .line 57
    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 54
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 61
    :cond_2
    iget v0, p0, Ldax;->c:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_3

    .line 62
    const/4 v0, 0x3

    iget v1, p0, Ldax;->c:I

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 64
    :cond_3
    iget-object v0, p0, Ldax;->d:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 65
    const/4 v0, 0x4

    iget-object v1, p0, Ldax;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 67
    :cond_4
    iget-object v0, p0, Ldax;->e:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 68
    const/4 v0, 0x5

    iget-object v1, p0, Ldax;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 70
    :cond_5
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 71
    return-void
.end method
