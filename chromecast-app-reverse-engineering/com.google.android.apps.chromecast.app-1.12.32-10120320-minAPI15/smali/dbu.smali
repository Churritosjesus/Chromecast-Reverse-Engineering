.class public final Ldbu;
.super Ldew;
.source "PG"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ldck;

.field private c:Ljava/lang/Integer;

.field private d:Ljava/lang/Long;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/Boolean;

.field private h:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 47
    invoke-direct {p0}, Ldew;-><init>()V

    .line 1052
    iput-object v0, p0, Ldbu;->a:Ljava/lang/String;

    .line 1053
    iput-object v0, p0, Ldbu;->b:Ldck;

    .line 1054
    iput-object v0, p0, Ldbu;->c:Ljava/lang/Integer;

    .line 1055
    iput-object v0, p0, Ldbu;->d:Ljava/lang/Long;

    .line 1056
    iput-object v0, p0, Ldbu;->e:Ljava/lang/String;

    .line 1057
    iput-object v0, p0, Ldbu;->f:Ljava/lang/String;

    .line 1058
    iput-object v0, p0, Ldbu;->g:Ljava/lang/Boolean;

    .line 1059
    iput-object v0, p0, Ldbu;->h:Ljava/lang/Integer;

    .line 1060
    const/4 v0, -0x1

    iput v0, p0, Ldbu;->t:I

    .line 49
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 4

    .prologue
    .line 96
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 97
    iget-object v1, p0, Ldbu;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 98
    const/4 v1, 0x1

    iget-object v2, p0, Ldbu;->a:Ljava/lang/String;

    .line 99
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 101
    :cond_0
    iget-object v1, p0, Ldbu;->b:Ldck;

    if-eqz v1, :cond_1

    .line 102
    const/4 v1, 0x2

    iget-object v2, p0, Ldbu;->b:Ldck;

    .line 103
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 105
    :cond_1
    iget-object v1, p0, Ldbu;->c:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    .line 106
    const/4 v1, 0x3

    iget-object v2, p0, Ldbu;->c:Ljava/lang/Integer;

    .line 107
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 109
    :cond_2
    iget-object v1, p0, Ldbu;->d:Ljava/lang/Long;

    if-eqz v1, :cond_3

    .line 110
    const/4 v1, 0x4

    iget-object v2, p0, Ldbu;->d:Ljava/lang/Long;

    .line 111
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Ldep;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 113
    :cond_3
    iget-object v1, p0, Ldbu;->e:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 114
    const/4 v1, 0x5

    iget-object v2, p0, Ldbu;->e:Ljava/lang/String;

    .line 115
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 117
    :cond_4
    iget-object v1, p0, Ldbu;->f:Ljava/lang/String;

    if-eqz v1, :cond_5

    .line 118
    const/4 v1, 0x6

    iget-object v2, p0, Ldbu;->f:Ljava/lang/String;

    .line 119
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 121
    :cond_5
    iget-object v1, p0, Ldbu;->h:Ljava/lang/Integer;

    if-eqz v1, :cond_6

    .line 122
    const/4 v1, 0x7

    iget-object v2, p0, Ldbu;->h:Ljava/lang/Integer;

    .line 123
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 125
    :cond_6
    iget-object v1, p0, Ldbu;->g:Ljava/lang/Boolean;

    if-eqz v1, :cond_7

    .line 126
    const/16 v1, 0x8

    iget-object v2, p0, Ldbu;->g:Ljava/lang/Boolean;

    .line 127
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1620
    invoke-static {v1}, Ldep;->b(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 127
    add-int/2addr v0, v1

    .line 129
    :cond_7
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 2

    .prologue
    .line 5
    .line 2137
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 2138
    sparse-switch v0, :sswitch_data_0

    .line 2142
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2143
    :sswitch_0
    return-object p0

    .line 2148
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbu;->a:Ljava/lang/String;

    goto :goto_0

    .line 2152
    :sswitch_2
    iget-object v0, p0, Ldbu;->b:Ldck;

    if-nez v0, :cond_1

    .line 2153
    new-instance v0, Ldck;

    invoke-direct {v0}, Ldck;-><init>()V

    iput-object v0, p0, Ldbu;->b:Ldck;

    .line 2155
    :cond_1
    iget-object v0, p0, Ldbu;->b:Ldck;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 3169
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 2159
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldbu;->c:Ljava/lang/Integer;

    goto :goto_0

    .line 2163
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ldbu;->d:Ljava/lang/Long;

    goto :goto_0

    .line 2167
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbu;->e:Ljava/lang/String;

    goto :goto_0

    .line 2171
    :sswitch_6
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbu;->f:Ljava/lang/String;

    goto :goto_0

    .line 4169
    :sswitch_7
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 2176
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 2179
    :pswitch_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldbu;->h:Ljava/lang/Integer;

    goto :goto_0

    .line 2185
    :sswitch_8
    invoke-virtual {p1}, Ldeo;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ldbu;->g:Ljava/lang/Boolean;

    goto :goto_0

    .line 2138
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x18 -> :sswitch_3
        0x20 -> :sswitch_4
        0x2a -> :sswitch_5
        0x32 -> :sswitch_6
        0x38 -> :sswitch_7
        0x40 -> :sswitch_8
    .end sparse-switch

    .line 2176
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Ldep;)V
    .locals 4

    .prologue
    .line 67
    iget-object v0, p0, Ldbu;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 68
    const/4 v0, 0x1

    iget-object v1, p0, Ldbu;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 70
    :cond_0
    iget-object v0, p0, Ldbu;->b:Ldck;

    if-eqz v0, :cond_1

    .line 71
    const/4 v0, 0x2

    iget-object v1, p0, Ldbu;->b:Ldck;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 73
    :cond_1
    iget-object v0, p0, Ldbu;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 74
    const/4 v0, 0x3

    iget-object v1, p0, Ldbu;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 76
    :cond_2
    iget-object v0, p0, Ldbu;->d:Ljava/lang/Long;

    if-eqz v0, :cond_3

    .line 77
    const/4 v0, 0x4

    iget-object v1, p0, Ldbu;->d:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Ldep;->a(IJ)V

    .line 79
    :cond_3
    iget-object v0, p0, Ldbu;->e:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 80
    const/4 v0, 0x5

    iget-object v1, p0, Ldbu;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 82
    :cond_4
    iget-object v0, p0, Ldbu;->f:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 83
    const/4 v0, 0x6

    iget-object v1, p0, Ldbu;->f:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 85
    :cond_5
    iget-object v0, p0, Ldbu;->h:Ljava/lang/Integer;

    if-eqz v0, :cond_6

    .line 86
    const/4 v0, 0x7

    iget-object v1, p0, Ldbu;->h:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 88
    :cond_6
    iget-object v0, p0, Ldbu;->g:Ljava/lang/Boolean;

    if-eqz v0, :cond_7

    .line 89
    const/16 v0, 0x8

    iget-object v1, p0, Ldbu;->g:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(IZ)V

    .line 91
    :cond_7
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 92
    return-void
.end method
