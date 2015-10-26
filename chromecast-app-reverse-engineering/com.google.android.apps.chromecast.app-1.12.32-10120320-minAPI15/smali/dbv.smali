.class public final Ldbv;
.super Ldew;
.source "PG"


# static fields
.field private static volatile e:[Ldbv;


# instance fields
.field public a:Ldcj;

.field public b:Ldck;

.field public c:Ljava/lang/Long;

.field public d:Ljava/lang/Integer;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/Boolean;

.field private h:Ljava/lang/Boolean;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 50
    invoke-direct {p0}, Ldew;-><init>()V

    .line 1055
    iput-object v0, p0, Ldbv;->f:Ljava/lang/String;

    .line 1056
    iput-object v0, p0, Ldbv;->g:Ljava/lang/Boolean;

    .line 1057
    iput-object v0, p0, Ldbv;->a:Ldcj;

    .line 1058
    iput-object v0, p0, Ldbv;->b:Ldck;

    .line 1059
    iput-object v0, p0, Ldbv;->c:Ljava/lang/Long;

    .line 1060
    iput-object v0, p0, Ldbv;->h:Ljava/lang/Boolean;

    .line 1061
    iput-object v0, p0, Ldbv;->d:Ljava/lang/Integer;

    .line 1062
    iput-object v0, p0, Ldbv;->i:Ljava/lang/String;

    .line 1063
    iput-object v0, p0, Ldbv;->j:Ljava/lang/String;

    .line 1064
    const/4 v0, -0x1

    iput v0, p0, Ldbv;->t:I

    .line 52
    return-void
.end method

.method public static a([B)Ldbv;
    .locals 1

    .prologue
    .line 215
    new-instance v0, Ldbv;

    invoke-direct {v0}, Ldbv;-><init>()V

    invoke-static {v0, p0}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldbv;

    return-object v0
.end method

.method public static b()[Ldbv;
    .locals 2

    .prologue
    .line 12
    sget-object v0, Ldbv;->e:[Ldbv;

    if-nez v0, :cond_1

    .line 13
    sget-object v1, Ldeu;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 15
    :try_start_0
    sget-object v0, Ldbv;->e:[Ldbv;

    if-nez v0, :cond_0

    .line 16
    const/4 v0, 0x0

    new-array v0, v0, [Ldbv;

    sput-object v0, Ldbv;->e:[Ldbv;

    .line 18
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :cond_1
    sget-object v0, Ldbv;->e:[Ldbv;

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
    .locals 4

    .prologue
    .line 103
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 104
    iget-object v1, p0, Ldbv;->g:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    .line 105
    const/4 v1, 0x1

    iget-object v2, p0, Ldbv;->g:Ljava/lang/Boolean;

    .line 106
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1620
    invoke-static {v1}, Ldep;->b(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 106
    add-int/2addr v0, v1

    .line 108
    :cond_0
    iget-object v1, p0, Ldbv;->a:Ldcj;

    if-eqz v1, :cond_1

    .line 109
    const/4 v1, 0x2

    iget-object v2, p0, Ldbv;->a:Ldcj;

    .line 110
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 112
    :cond_1
    iget-object v1, p0, Ldbv;->b:Ldck;

    if-eqz v1, :cond_2

    .line 113
    const/4 v1, 0x3

    iget-object v2, p0, Ldbv;->b:Ldck;

    .line 114
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 116
    :cond_2
    iget-object v1, p0, Ldbv;->c:Ljava/lang/Long;

    if-eqz v1, :cond_3

    .line 117
    const/4 v1, 0x4

    iget-object v2, p0, Ldbv;->c:Ljava/lang/Long;

    .line 118
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Ldep;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 120
    :cond_3
    iget-object v1, p0, Ldbv;->h:Ljava/lang/Boolean;

    if-eqz v1, :cond_4

    .line 121
    const/4 v1, 0x5

    iget-object v2, p0, Ldbv;->h:Ljava/lang/Boolean;

    .line 122
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2620
    invoke-static {v1}, Ldep;->b(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 122
    add-int/2addr v0, v1

    .line 124
    :cond_4
    iget-object v1, p0, Ldbv;->d:Ljava/lang/Integer;

    if-eqz v1, :cond_5

    .line 125
    const/4 v1, 0x6

    iget-object v2, p0, Ldbv;->d:Ljava/lang/Integer;

    .line 126
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 128
    :cond_5
    iget-object v1, p0, Ldbv;->i:Ljava/lang/String;

    if-eqz v1, :cond_6

    .line 129
    const/4 v1, 0x7

    iget-object v2, p0, Ldbv;->i:Ljava/lang/String;

    .line 130
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 132
    :cond_6
    iget-object v1, p0, Ldbv;->j:Ljava/lang/String;

    if-eqz v1, :cond_7

    .line 133
    const/16 v1, 0x8

    iget-object v2, p0, Ldbv;->j:Ljava/lang/String;

    .line 134
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 136
    :cond_7
    iget-object v1, p0, Ldbv;->f:Ljava/lang/String;

    if-eqz v1, :cond_8

    .line 137
    const/16 v1, 0x9

    iget-object v2, p0, Ldbv;->f:Ljava/lang/String;

    .line 138
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 140
    :cond_8
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 2

    .prologue
    .line 5
    .line 3148
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 3149
    sparse-switch v0, :sswitch_data_0

    .line 3153
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3154
    :sswitch_0
    return-object p0

    .line 3159
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ldbv;->g:Ljava/lang/Boolean;

    goto :goto_0

    .line 3163
    :sswitch_2
    iget-object v0, p0, Ldbv;->a:Ldcj;

    if-nez v0, :cond_1

    .line 3164
    new-instance v0, Ldcj;

    invoke-direct {v0}, Ldcj;-><init>()V

    iput-object v0, p0, Ldbv;->a:Ldcj;

    .line 3166
    :cond_1
    iget-object v0, p0, Ldbv;->a:Ldcj;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 3170
    :sswitch_3
    iget-object v0, p0, Ldbv;->b:Ldck;

    if-nez v0, :cond_2

    .line 3171
    new-instance v0, Ldck;

    invoke-direct {v0}, Ldck;-><init>()V

    iput-object v0, p0, Ldbv;->b:Ldck;

    .line 3173
    :cond_2
    iget-object v0, p0, Ldbv;->b:Ldck;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 3177
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ldbv;->c:Ljava/lang/Long;

    goto :goto_0

    .line 3181
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ldbv;->h:Ljava/lang/Boolean;

    goto :goto_0

    .line 4169
    :sswitch_6
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 3186
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 3192
    :pswitch_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldbv;->d:Ljava/lang/Integer;

    goto :goto_0

    .line 3198
    :sswitch_7
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbv;->i:Ljava/lang/String;

    goto :goto_0

    .line 3202
    :sswitch_8
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbv;->j:Ljava/lang/String;

    goto :goto_0

    .line 3206
    :sswitch_9
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbv;->f:Ljava/lang/String;

    goto :goto_0

    .line 3149
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x20 -> :sswitch_4
        0x28 -> :sswitch_5
        0x30 -> :sswitch_6
        0x3a -> :sswitch_7
        0x42 -> :sswitch_8
        0x4a -> :sswitch_9
    .end sparse-switch

    .line 3186
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Ldep;)V
    .locals 4

    .prologue
    .line 71
    iget-object v0, p0, Ldbv;->g:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 72
    const/4 v0, 0x1

    iget-object v1, p0, Ldbv;->g:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(IZ)V

    .line 74
    :cond_0
    iget-object v0, p0, Ldbv;->a:Ldcj;

    if-eqz v0, :cond_1

    .line 75
    const/4 v0, 0x2

    iget-object v1, p0, Ldbv;->a:Ldcj;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 77
    :cond_1
    iget-object v0, p0, Ldbv;->b:Ldck;

    if-eqz v0, :cond_2

    .line 78
    const/4 v0, 0x3

    iget-object v1, p0, Ldbv;->b:Ldck;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 80
    :cond_2
    iget-object v0, p0, Ldbv;->c:Ljava/lang/Long;

    if-eqz v0, :cond_3

    .line 81
    const/4 v0, 0x4

    iget-object v1, p0, Ldbv;->c:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Ldep;->a(IJ)V

    .line 83
    :cond_3
    iget-object v0, p0, Ldbv;->h:Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    .line 84
    const/4 v0, 0x5

    iget-object v1, p0, Ldbv;->h:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(IZ)V

    .line 86
    :cond_4
    iget-object v0, p0, Ldbv;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_5

    .line 87
    const/4 v0, 0x6

    iget-object v1, p0, Ldbv;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 89
    :cond_5
    iget-object v0, p0, Ldbv;->i:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 90
    const/4 v0, 0x7

    iget-object v1, p0, Ldbv;->i:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 92
    :cond_6
    iget-object v0, p0, Ldbv;->j:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 93
    const/16 v0, 0x8

    iget-object v1, p0, Ldbv;->j:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 95
    :cond_7
    iget-object v0, p0, Ldbv;->f:Ljava/lang/String;

    if-eqz v0, :cond_8

    .line 96
    const/16 v0, 0x9

    iget-object v1, p0, Ldbv;->f:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 98
    :cond_8
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 99
    return-void
.end method
