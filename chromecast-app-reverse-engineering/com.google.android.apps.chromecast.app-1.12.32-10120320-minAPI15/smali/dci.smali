.class public final Ldci;
.super Ldew;
.source "PG"


# static fields
.field private static volatile d:[Ldci;


# instance fields
.field public a:Ljava/lang/Boolean;

.field public b:[Ldca;

.field public c:Ljava/lang/String;

.field private e:Ljava/lang/Integer;

.field private f:Ljava/lang/Long;

.field private g:[Ldby;

.field private h:[Ldcb;

.field private i:Ljava/lang/Boolean;

.field private j:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 50
    invoke-direct {p0}, Ldew;-><init>()V

    .line 1055
    iput-object v1, p0, Ldci;->e:Ljava/lang/Integer;

    .line 1056
    iput-object v1, p0, Ldci;->f:Ljava/lang/Long;

    .line 1057
    iput-object v1, p0, Ldci;->a:Ljava/lang/Boolean;

    .line 1058
    invoke-static {}, Ldby;->b()[Ldby;

    move-result-object v0

    iput-object v0, p0, Ldci;->g:[Ldby;

    .line 1059
    invoke-static {}, Ldca;->b()[Ldca;

    move-result-object v0

    iput-object v0, p0, Ldci;->b:[Ldca;

    .line 1060
    invoke-static {}, Ldcb;->b()[Ldcb;

    move-result-object v0

    iput-object v0, p0, Ldci;->h:[Ldcb;

    .line 1061
    iput-object v1, p0, Ldci;->c:Ljava/lang/String;

    .line 1062
    iput-object v1, p0, Ldci;->i:Ljava/lang/Boolean;

    .line 1063
    iput-object v1, p0, Ldci;->j:Ljava/lang/Integer;

    .line 1064
    const/4 v0, -0x1

    iput v0, p0, Ldci;->t:I

    .line 52
    return-void
.end method

.method public static b()[Ldci;
    .locals 2

    .prologue
    .line 12
    sget-object v0, Ldci;->d:[Ldci;

    if-nez v0, :cond_1

    .line 13
    sget-object v1, Ldeu;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 15
    :try_start_0
    sget-object v0, Ldci;->d:[Ldci;

    if-nez v0, :cond_0

    .line 16
    const/4 v0, 0x0

    new-array v0, v0, [Ldci;

    sput-object v0, Ldci;->d:[Ldci;

    .line 18
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :cond_1
    sget-object v0, Ldci;->d:[Ldci;

    return-object v0

    .line 18
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method protected final a()I
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 118
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 119
    iget-object v2, p0, Ldci;->e:Ljava/lang/Integer;

    if-eqz v2, :cond_0

    .line 120
    const/4 v2, 0x1

    iget-object v3, p0, Ldci;->e:Ljava/lang/Integer;

    .line 121
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v2, v3}, Ldep;->b(II)I

    move-result v2

    add-int/2addr v0, v2

    .line 123
    :cond_0
    iget-object v2, p0, Ldci;->a:Ljava/lang/Boolean;

    if-eqz v2, :cond_1

    .line 124
    const/4 v2, 0x2

    iget-object v3, p0, Ldci;->a:Ljava/lang/Boolean;

    .line 125
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1620
    invoke-static {v2}, Ldep;->b(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 125
    add-int/2addr v0, v2

    .line 127
    :cond_1
    iget-object v2, p0, Ldci;->g:[Ldby;

    if-eqz v2, :cond_4

    iget-object v2, p0, Ldci;->g:[Ldby;

    array-length v2, v2

    if-lez v2, :cond_4

    move v2, v0

    move v0, v1

    .line 128
    :goto_0
    iget-object v3, p0, Ldci;->g:[Ldby;

    array-length v3, v3

    if-ge v0, v3, :cond_3

    .line 129
    iget-object v3, p0, Ldci;->g:[Ldby;

    aget-object v3, v3, v0

    .line 130
    if-eqz v3, :cond_2

    .line 131
    const/4 v4, 0x3

    .line 132
    invoke-static {v4, v3}, Ldep;->b(ILdew;)I

    move-result v3

    add-int/2addr v2, v3

    .line 128
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v2

    .line 136
    :cond_4
    iget-object v2, p0, Ldci;->b:[Ldca;

    if-eqz v2, :cond_7

    iget-object v2, p0, Ldci;->b:[Ldca;

    array-length v2, v2

    if-lez v2, :cond_7

    move v2, v0

    move v0, v1

    .line 137
    :goto_1
    iget-object v3, p0, Ldci;->b:[Ldca;

    array-length v3, v3

    if-ge v0, v3, :cond_6

    .line 138
    iget-object v3, p0, Ldci;->b:[Ldca;

    aget-object v3, v3, v0

    .line 139
    if-eqz v3, :cond_5

    .line 140
    const/4 v4, 0x4

    .line 141
    invoke-static {v4, v3}, Ldep;->b(ILdew;)I

    move-result v3

    add-int/2addr v2, v3

    .line 137
    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    move v0, v2

    .line 145
    :cond_7
    iget-object v2, p0, Ldci;->f:Ljava/lang/Long;

    if-eqz v2, :cond_8

    .line 146
    const/4 v2, 0x5

    iget-object v3, p0, Ldci;->f:Ljava/lang/Long;

    .line 147
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Ldep;->b(IJ)I

    move-result v2

    add-int/2addr v0, v2

    .line 149
    :cond_8
    iget-object v2, p0, Ldci;->c:Ljava/lang/String;

    if-eqz v2, :cond_9

    .line 150
    const/4 v2, 0x7

    iget-object v3, p0, Ldci;->c:Ljava/lang/String;

    .line 151
    invoke-static {v2, v3}, Ldep;->b(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    .line 153
    :cond_9
    iget-object v2, p0, Ldci;->i:Ljava/lang/Boolean;

    if-eqz v2, :cond_a

    .line 154
    const/16 v2, 0x8

    iget-object v3, p0, Ldci;->i:Ljava/lang/Boolean;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2620
    invoke-static {v2}, Ldep;->b(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 155
    add-int/2addr v0, v2

    .line 157
    :cond_a
    iget-object v2, p0, Ldci;->h:[Ldcb;

    if-eqz v2, :cond_c

    iget-object v2, p0, Ldci;->h:[Ldcb;

    array-length v2, v2

    if-lez v2, :cond_c

    .line 158
    :goto_2
    iget-object v2, p0, Ldci;->h:[Ldcb;

    array-length v2, v2

    if-ge v1, v2, :cond_c

    .line 159
    iget-object v2, p0, Ldci;->h:[Ldcb;

    aget-object v2, v2, v1

    .line 160
    if-eqz v2, :cond_b

    .line 161
    const/16 v3, 0x9

    .line 162
    invoke-static {v3, v2}, Ldep;->b(ILdew;)I

    move-result v2

    add-int/2addr v0, v2

    .line 158
    :cond_b
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 166
    :cond_c
    iget-object v1, p0, Ldci;->j:Ljava/lang/Integer;

    if-eqz v1, :cond_d

    .line 167
    const/16 v1, 0xa

    iget-object v2, p0, Ldci;->j:Ljava/lang/Integer;

    .line 168
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 170
    :cond_d
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5
    .line 3178
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 3179
    sparse-switch v0, :sswitch_data_0

    .line 3183
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3184
    :sswitch_0
    return-object p0

    .line 4169
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 3189
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldci;->e:Ljava/lang/Integer;

    goto :goto_0

    .line 3193
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ldci;->a:Ljava/lang/Boolean;

    goto :goto_0

    .line 3197
    :sswitch_3
    const/16 v0, 0x1a

    .line 3198
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 3199
    iget-object v0, p0, Ldci;->g:[Ldby;

    if-nez v0, :cond_2

    move v0, v1

    .line 3200
    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ldby;

    .line 3202
    if-eqz v0, :cond_1

    .line 3203
    iget-object v3, p0, Ldci;->g:[Ldby;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3205
    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    .line 3206
    new-instance v3, Ldby;

    invoke-direct {v3}, Ldby;-><init>()V

    aput-object v3, v2, v0

    .line 3207
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ldeo;->a(Ldew;)V

    .line 3208
    invoke-virtual {p1}, Ldeo;->a()I

    .line 3205
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 3199
    :cond_2
    iget-object v0, p0, Ldci;->g:[Ldby;

    array-length v0, v0

    goto :goto_1

    .line 3211
    :cond_3
    new-instance v3, Ldby;

    invoke-direct {v3}, Ldby;-><init>()V

    aput-object v3, v2, v0

    .line 3212
    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    .line 3213
    iput-object v2, p0, Ldci;->g:[Ldby;

    goto :goto_0

    .line 3217
    :sswitch_4
    const/16 v0, 0x22

    .line 3218
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 3219
    iget-object v0, p0, Ldci;->b:[Ldca;

    if-nez v0, :cond_5

    move v0, v1

    .line 3220
    :goto_3
    add-int/2addr v2, v0

    new-array v2, v2, [Ldca;

    .line 3222
    if-eqz v0, :cond_4

    .line 3223
    iget-object v3, p0, Ldci;->b:[Ldca;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3225
    :cond_4
    :goto_4
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_6

    .line 3226
    new-instance v3, Ldca;

    invoke-direct {v3}, Ldca;-><init>()V

    aput-object v3, v2, v0

    .line 3227
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ldeo;->a(Ldew;)V

    .line 3228
    invoke-virtual {p1}, Ldeo;->a()I

    .line 3225
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 3219
    :cond_5
    iget-object v0, p0, Ldci;->b:[Ldca;

    array-length v0, v0

    goto :goto_3

    .line 3231
    :cond_6
    new-instance v3, Ldca;

    invoke-direct {v3}, Ldca;-><init>()V

    aput-object v3, v2, v0

    .line 3232
    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    .line 3233
    iput-object v2, p0, Ldci;->b:[Ldca;

    goto/16 :goto_0

    .line 3237
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ldci;->f:Ljava/lang/Long;

    goto/16 :goto_0

    .line 3241
    :sswitch_6
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldci;->c:Ljava/lang/String;

    goto/16 :goto_0

    .line 3245
    :sswitch_7
    invoke-virtual {p1}, Ldeo;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ldci;->i:Ljava/lang/Boolean;

    goto/16 :goto_0

    .line 3249
    :sswitch_8
    const/16 v0, 0x4a

    .line 3250
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 3251
    iget-object v0, p0, Ldci;->h:[Ldcb;

    if-nez v0, :cond_8

    move v0, v1

    .line 3252
    :goto_5
    add-int/2addr v2, v0

    new-array v2, v2, [Ldcb;

    .line 3254
    if-eqz v0, :cond_7

    .line 3255
    iget-object v3, p0, Ldci;->h:[Ldcb;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3257
    :cond_7
    :goto_6
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_9

    .line 3258
    new-instance v3, Ldcb;

    invoke-direct {v3}, Ldcb;-><init>()V

    aput-object v3, v2, v0

    .line 3259
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ldeo;->a(Ldew;)V

    .line 3260
    invoke-virtual {p1}, Ldeo;->a()I

    .line 3257
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 3251
    :cond_8
    iget-object v0, p0, Ldci;->h:[Ldcb;

    array-length v0, v0

    goto :goto_5

    .line 3263
    :cond_9
    new-instance v3, Ldcb;

    invoke-direct {v3}, Ldcb;-><init>()V

    aput-object v3, v2, v0

    .line 3264
    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    .line 3265
    iput-object v2, p0, Ldci;->h:[Ldcb;

    goto/16 :goto_0

    .line 5169
    :sswitch_9
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 3270
    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 3274
    :pswitch_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldci;->j:Ljava/lang/Integer;

    goto/16 :goto_0

    .line 3179
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x28 -> :sswitch_5
        0x3a -> :sswitch_6
        0x40 -> :sswitch_7
        0x4a -> :sswitch_8
        0x50 -> :sswitch_9
    .end sparse-switch

    .line 3270
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Ldep;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 71
    iget-object v0, p0, Ldci;->e:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 72
    const/4 v0, 0x1

    iget-object v2, p0, Ldci;->e:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1, v0, v2}, Ldep;->a(II)V

    .line 74
    :cond_0
    iget-object v0, p0, Ldci;->a:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    .line 75
    const/4 v0, 0x2

    iget-object v2, p0, Ldci;->a:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p1, v0, v2}, Ldep;->a(IZ)V

    .line 77
    :cond_1
    iget-object v0, p0, Ldci;->g:[Ldby;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ldci;->g:[Ldby;

    array-length v0, v0

    if-lez v0, :cond_3

    move v0, v1

    .line 78
    :goto_0
    iget-object v2, p0, Ldci;->g:[Ldby;

    array-length v2, v2

    if-ge v0, v2, :cond_3

    .line 79
    iget-object v2, p0, Ldci;->g:[Ldby;

    aget-object v2, v2, v0

    .line 80
    if-eqz v2, :cond_2

    .line 81
    const/4 v3, 0x3

    invoke-virtual {p1, v3, v2}, Ldep;->a(ILdew;)V

    .line 78
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 85
    :cond_3
    iget-object v0, p0, Ldci;->b:[Ldca;

    if-eqz v0, :cond_5

    iget-object v0, p0, Ldci;->b:[Ldca;

    array-length v0, v0

    if-lez v0, :cond_5

    move v0, v1

    .line 86
    :goto_1
    iget-object v2, p0, Ldci;->b:[Ldca;

    array-length v2, v2

    if-ge v0, v2, :cond_5

    .line 87
    iget-object v2, p0, Ldci;->b:[Ldca;

    aget-object v2, v2, v0

    .line 88
    if-eqz v2, :cond_4

    .line 89
    const/4 v3, 0x4

    invoke-virtual {p1, v3, v2}, Ldep;->a(ILdew;)V

    .line 86
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 93
    :cond_5
    iget-object v0, p0, Ldci;->f:Ljava/lang/Long;

    if-eqz v0, :cond_6

    .line 94
    const/4 v0, 0x5

    iget-object v2, p0, Ldci;->f:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Ldep;->a(IJ)V

    .line 96
    :cond_6
    iget-object v0, p0, Ldci;->c:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 97
    const/4 v0, 0x7

    iget-object v2, p0, Ldci;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Ldep;->a(ILjava/lang/String;)V

    .line 99
    :cond_7
    iget-object v0, p0, Ldci;->i:Ljava/lang/Boolean;

    if-eqz v0, :cond_8

    .line 100
    const/16 v0, 0x8

    iget-object v2, p0, Ldci;->i:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p1, v0, v2}, Ldep;->a(IZ)V

    .line 102
    :cond_8
    iget-object v0, p0, Ldci;->h:[Ldcb;

    if-eqz v0, :cond_a

    iget-object v0, p0, Ldci;->h:[Ldcb;

    array-length v0, v0

    if-lez v0, :cond_a

    .line 103
    :goto_2
    iget-object v0, p0, Ldci;->h:[Ldcb;

    array-length v0, v0

    if-ge v1, v0, :cond_a

    .line 104
    iget-object v0, p0, Ldci;->h:[Ldcb;

    aget-object v0, v0, v1

    .line 105
    if-eqz v0, :cond_9

    .line 106
    const/16 v2, 0x9

    invoke-virtual {p1, v2, v0}, Ldep;->a(ILdew;)V

    .line 103
    :cond_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 110
    :cond_a
    iget-object v0, p0, Ldci;->j:Ljava/lang/Integer;

    if-eqz v0, :cond_b

    .line 111
    const/16 v0, 0xa

    iget-object v1, p0, Ldci;->j:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 113
    :cond_b
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 114
    return-void
.end method
