.class public final Ldcz;
.super Lder;
.source "PG"


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:I

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/Long;

.field public e:Ljava/lang/Long;

.field public f:Ljava/lang/Long;

.field public g:Lddc;

.field public h:Ldde;

.field private j:Lddd;

.field private k:Ldcy;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 55
    invoke-direct {p0}, Lder;-><init>()V

    .line 56
    iput-object v1, p0, Ldcz;->a:Ljava/lang/Integer;

    .line 57
    const/high16 v0, -0x80000000

    iput v0, p0, Ldcz;->b:I

    .line 58
    iput-object v1, p0, Ldcz;->c:Ljava/lang/String;

    .line 59
    iput-object v1, p0, Ldcz;->d:Ljava/lang/Long;

    .line 60
    iput-object v1, p0, Ldcz;->e:Ljava/lang/Long;

    .line 61
    iput-object v1, p0, Ldcz;->f:Ljava/lang/Long;

    .line 62
    iput-object v1, p0, Ldcz;->g:Lddc;

    .line 63
    iput-object v1, p0, Ldcz;->h:Ldde;

    .line 64
    iput-object v1, p0, Ldcz;->j:Lddd;

    .line 65
    iput-object v1, p0, Ldcz;->k:Ldcy;

    .line 66
    iput-object v1, p0, Ldcz;->i:Ldes;

    .line 67
    const/4 v0, -0x1

    iput v0, p0, Ldcz;->t:I

    .line 68
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 4

    .prologue
    .line 108
    invoke-super {p0}, Lder;->a()I

    move-result v0

    .line 109
    iget-object v1, p0, Ldcz;->a:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 110
    const/4 v1, 0x1

    iget-object v2, p0, Ldcz;->a:Ljava/lang/Integer;

    .line 111
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 113
    :cond_0
    iget v1, p0, Ldcz;->b:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_1

    .line 114
    const/4 v1, 0x2

    iget v2, p0, Ldcz;->b:I

    .line 115
    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 117
    :cond_1
    iget-object v1, p0, Ldcz;->c:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 118
    const/4 v1, 0x4

    iget-object v2, p0, Ldcz;->c:Ljava/lang/String;

    .line 119
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 121
    :cond_2
    iget-object v1, p0, Ldcz;->d:Ljava/lang/Long;

    if-eqz v1, :cond_3

    .line 122
    const/4 v1, 0x6

    iget-object v2, p0, Ldcz;->d:Ljava/lang/Long;

    .line 123
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Ldep;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 125
    :cond_3
    iget-object v1, p0, Ldcz;->e:Ljava/lang/Long;

    if-eqz v1, :cond_4

    .line 126
    const/4 v1, 0x7

    iget-object v2, p0, Ldcz;->e:Ljava/lang/Long;

    .line 127
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Ldep;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 129
    :cond_4
    iget-object v1, p0, Ldcz;->f:Ljava/lang/Long;

    if-eqz v1, :cond_5

    .line 130
    const/16 v1, 0x8

    iget-object v2, p0, Ldcz;->f:Ljava/lang/Long;

    .line 131
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Ldep;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 133
    :cond_5
    iget-object v1, p0, Ldcz;->g:Lddc;

    if-eqz v1, :cond_6

    .line 134
    const/16 v1, 0x9

    iget-object v2, p0, Ldcz;->g:Lddc;

    .line 135
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 137
    :cond_6
    iget-object v1, p0, Ldcz;->h:Ldde;

    if-eqz v1, :cond_7

    .line 138
    const/16 v1, 0xa

    iget-object v2, p0, Ldcz;->h:Ldde;

    .line 139
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 141
    :cond_7
    iget-object v1, p0, Ldcz;->j:Lddd;

    if-eqz v1, :cond_8

    .line 142
    const/16 v1, 0xb

    iget-object v2, p0, Ldcz;->j:Lddd;

    .line 143
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 145
    :cond_8
    iget-object v1, p0, Ldcz;->k:Ldcy;

    if-eqz v1, :cond_9

    .line 146
    const/16 v1, 0xc

    iget-object v2, p0, Ldcz;->k:Ldcy;

    .line 147
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 149
    :cond_9
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 2

    .prologue
    .line 8
    .line 1157
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1158
    sparse-switch v0, :sswitch_data_0

    .line 1162
    invoke-super {p0, p1, v0}, Lder;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1163
    :sswitch_0
    return-object p0

    .line 2169
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1168
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldcz;->a:Ljava/lang/Integer;

    goto :goto_0

    .line 3169
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1173
    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 1327
    :pswitch_1
    iput v0, p0, Ldcz;->b:I

    goto :goto_0

    .line 1333
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldcz;->c:Ljava/lang/String;

    goto :goto_0

    .line 1337
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ldcz;->d:Ljava/lang/Long;

    goto :goto_0

    .line 1341
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ldcz;->e:Ljava/lang/Long;

    goto :goto_0

    .line 1345
    :sswitch_6
    invoke-virtual {p1}, Ldeo;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ldcz;->f:Ljava/lang/Long;

    goto :goto_0

    .line 1349
    :sswitch_7
    iget-object v0, p0, Ldcz;->g:Lddc;

    if-nez v0, :cond_1

    .line 1350
    new-instance v0, Lddc;

    invoke-direct {v0}, Lddc;-><init>()V

    iput-object v0, p0, Ldcz;->g:Lddc;

    .line 1352
    :cond_1
    iget-object v0, p0, Ldcz;->g:Lddc;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1356
    :sswitch_8
    iget-object v0, p0, Ldcz;->h:Ldde;

    if-nez v0, :cond_2

    .line 1357
    new-instance v0, Ldde;

    invoke-direct {v0}, Ldde;-><init>()V

    iput-object v0, p0, Ldcz;->h:Ldde;

    .line 1359
    :cond_2
    iget-object v0, p0, Ldcz;->h:Ldde;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1363
    :sswitch_9
    iget-object v0, p0, Ldcz;->j:Lddd;

    if-nez v0, :cond_3

    .line 1364
    new-instance v0, Lddd;

    invoke-direct {v0}, Lddd;-><init>()V

    iput-object v0, p0, Ldcz;->j:Lddd;

    .line 1366
    :cond_3
    iget-object v0, p0, Ldcz;->j:Lddd;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1370
    :sswitch_a
    iget-object v0, p0, Ldcz;->k:Ldcy;

    if-nez v0, :cond_4

    .line 1371
    new-instance v0, Ldcy;

    invoke-direct {v0}, Ldcy;-><init>()V

    iput-object v0, p0, Ldcz;->k:Ldcy;

    .line 1373
    :cond_4
    iget-object v0, p0, Ldcz;->k:Ldcy;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto/16 :goto_0

    .line 1158
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x22 -> :sswitch_3
        0x30 -> :sswitch_4
        0x38 -> :sswitch_5
        0x40 -> :sswitch_6
        0x4a -> :sswitch_7
        0x52 -> :sswitch_8
        0x5a -> :sswitch_9
        0x62 -> :sswitch_a
    .end sparse-switch

    .line 1173
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Ldep;)V
    .locals 4

    .prologue
    .line 73
    iget-object v0, p0, Ldcz;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 74
    const/4 v0, 0x1

    iget-object v1, p0, Ldcz;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 76
    :cond_0
    iget v0, p0, Ldcz;->b:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    .line 77
    const/4 v0, 0x2

    iget v1, p0, Ldcz;->b:I

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 79
    :cond_1
    iget-object v0, p0, Ldcz;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 80
    const/4 v0, 0x4

    iget-object v1, p0, Ldcz;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 82
    :cond_2
    iget-object v0, p0, Ldcz;->d:Ljava/lang/Long;

    if-eqz v0, :cond_3

    .line 83
    const/4 v0, 0x6

    iget-object v1, p0, Ldcz;->d:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Ldep;->a(IJ)V

    .line 85
    :cond_3
    iget-object v0, p0, Ldcz;->e:Ljava/lang/Long;

    if-eqz v0, :cond_4

    .line 86
    const/4 v0, 0x7

    iget-object v1, p0, Ldcz;->e:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Ldep;->a(IJ)V

    .line 88
    :cond_4
    iget-object v0, p0, Ldcz;->f:Ljava/lang/Long;

    if-eqz v0, :cond_5

    .line 89
    const/16 v0, 0x8

    iget-object v1, p0, Ldcz;->f:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Ldep;->a(IJ)V

    .line 91
    :cond_5
    iget-object v0, p0, Ldcz;->g:Lddc;

    if-eqz v0, :cond_6

    .line 92
    const/16 v0, 0x9

    iget-object v1, p0, Ldcz;->g:Lddc;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 94
    :cond_6
    iget-object v0, p0, Ldcz;->h:Ldde;

    if-eqz v0, :cond_7

    .line 95
    const/16 v0, 0xa

    iget-object v1, p0, Ldcz;->h:Ldde;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 97
    :cond_7
    iget-object v0, p0, Ldcz;->j:Lddd;

    if-eqz v0, :cond_8

    .line 98
    const/16 v0, 0xb

    iget-object v1, p0, Ldcz;->j:Lddd;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 100
    :cond_8
    iget-object v0, p0, Ldcz;->k:Ldcy;

    if-eqz v0, :cond_9

    .line 101
    const/16 v0, 0xc

    iget-object v1, p0, Ldcz;->k:Ldcy;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 103
    :cond_9
    invoke-super {p0, p1}, Lder;->a(Ldep;)V

    .line 104
    return-void
.end method
