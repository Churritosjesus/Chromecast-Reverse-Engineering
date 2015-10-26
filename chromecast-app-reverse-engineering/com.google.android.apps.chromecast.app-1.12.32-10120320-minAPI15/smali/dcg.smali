.class public final Ldcg;
.super Ldew;
.source "PG"


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:Ljava/lang/String;

.field public c:[Ldbt;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 35
    invoke-direct {p0}, Ldew;-><init>()V

    .line 1040
    iput-object v0, p0, Ldcg;->a:Ljava/lang/Integer;

    .line 1041
    iput-object v0, p0, Ldcg;->b:Ljava/lang/String;

    .line 1042
    iput-object v0, p0, Ldcg;->d:Ljava/lang/String;

    .line 1043
    invoke-static {}, Ldbt;->b()[Ldbt;

    move-result-object v0

    iput-object v0, p0, Ldcg;->c:[Ldbt;

    .line 1044
    const/4 v0, -0x1

    iput v0, p0, Ldcg;->t:I

    .line 37
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 5

    .prologue
    .line 73
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 74
    iget-object v1, p0, Ldcg;->a:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 75
    const/4 v1, 0x1

    iget-object v2, p0, Ldcg;->a:Ljava/lang/Integer;

    .line 76
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 78
    :cond_0
    iget-object v1, p0, Ldcg;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 79
    const/4 v1, 0x2

    iget-object v2, p0, Ldcg;->b:Ljava/lang/String;

    .line 80
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 82
    :cond_1
    iget-object v1, p0, Ldcg;->d:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 83
    const/4 v1, 0x3

    iget-object v2, p0, Ldcg;->d:Ljava/lang/String;

    .line 84
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 86
    :cond_2
    iget-object v1, p0, Ldcg;->c:[Ldbt;

    if-eqz v1, :cond_5

    iget-object v1, p0, Ldcg;->c:[Ldbt;

    array-length v1, v1

    if-lez v1, :cond_5

    .line 87
    const/4 v1, 0x0

    move v4, v1

    move v1, v0

    move v0, v4

    :goto_0
    iget-object v2, p0, Ldcg;->c:[Ldbt;

    array-length v2, v2

    if-ge v0, v2, :cond_4

    .line 88
    iget-object v2, p0, Ldcg;->c:[Ldbt;

    aget-object v2, v2, v0

    .line 89
    if-eqz v2, :cond_3

    .line 90
    const/4 v3, 0x4

    .line 91
    invoke-static {v3, v2}, Ldep;->b(ILdew;)I

    move-result v2

    add-int/2addr v1, v2

    .line 87
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    move v0, v1

    .line 95
    :cond_5
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5
    .line 1103
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1104
    sparse-switch v0, :sswitch_data_0

    .line 1108
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1109
    :sswitch_0
    return-object p0

    .line 1169
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1115
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1118
    :pswitch_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldcg;->a:Ljava/lang/Integer;

    goto :goto_0

    .line 1124
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldcg;->b:Ljava/lang/String;

    goto :goto_0

    .line 1128
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldcg;->d:Ljava/lang/String;

    goto :goto_0

    .line 1132
    :sswitch_4
    const/16 v0, 0x22

    .line 1133
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 1134
    iget-object v0, p0, Ldcg;->c:[Ldbt;

    if-nez v0, :cond_2

    move v0, v1

    .line 1135
    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ldbt;

    .line 1137
    if-eqz v0, :cond_1

    .line 1138
    iget-object v3, p0, Ldcg;->c:[Ldbt;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1140
    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    .line 1141
    new-instance v3, Ldbt;

    invoke-direct {v3}, Ldbt;-><init>()V

    aput-object v3, v2, v0

    .line 1142
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ldeo;->a(Ldew;)V

    .line 1143
    invoke-virtual {p1}, Ldeo;->a()I

    .line 1140
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1134
    :cond_2
    iget-object v0, p0, Ldcg;->c:[Ldbt;

    array-length v0, v0

    goto :goto_1

    .line 1146
    :cond_3
    new-instance v3, Ldbt;

    invoke-direct {v3}, Ldbt;-><init>()V

    aput-object v3, v2, v0

    .line 1147
    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    .line 1148
    iput-object v2, p0, Ldcg;->c:[Ldbt;

    goto :goto_0

    .line 1104
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
    .end sparse-switch

    .line 1115
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Ldep;)V
    .locals 3

    .prologue
    .line 51
    iget-object v0, p0, Ldcg;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 52
    const/4 v0, 0x1

    iget-object v1, p0, Ldcg;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 54
    :cond_0
    iget-object v0, p0, Ldcg;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 55
    const/4 v0, 0x2

    iget-object v1, p0, Ldcg;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 57
    :cond_1
    iget-object v0, p0, Ldcg;->d:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 58
    const/4 v0, 0x3

    iget-object v1, p0, Ldcg;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 60
    :cond_2
    iget-object v0, p0, Ldcg;->c:[Ldbt;

    if-eqz v0, :cond_4

    iget-object v0, p0, Ldcg;->c:[Ldbt;

    array-length v0, v0

    if-lez v0, :cond_4

    .line 61
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ldcg;->c:[Ldbt;

    array-length v1, v1

    if-ge v0, v1, :cond_4

    .line 62
    iget-object v1, p0, Ldcg;->c:[Ldbt;

    aget-object v1, v1, v0

    .line 63
    if-eqz v1, :cond_3

    .line 64
    const/4 v2, 0x4

    invoke-virtual {p1, v2, v1}, Ldep;->a(ILdew;)V

    .line 61
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 68
    :cond_4
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 69
    return-void
.end method
