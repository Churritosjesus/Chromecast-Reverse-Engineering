.class public final Lbjh;
.super Lj;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private Z:Lapd;

.field private a:J

.field private aa:Lbjk;

.field private ab:I

.field private ac:Z

.field private ad:I

.field private ae:Z

.field private af:Landroid/os/Handler;

.field private final ag:Ljava/lang/Runnable;

.field private b:I

.field private c:I

.field private final d:Lblp;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 95
    invoke-direct {p0}, Lj;-><init>()V

    .line 77
    iput v0, p0, Lbjh;->ad:I

    .line 80
    iput-boolean v0, p0, Lbjh;->ae:Z

    .line 83
    new-instance v0, Lbji;

    invoke-direct {v0, p0}, Lbji;-><init>(Lbjh;)V

    iput-object v0, p0, Lbjh;->ag:Ljava/lang/Runnable;

    .line 96
    new-instance v0, Lblp;

    const-string v1, "PollOtaFragment"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lbjh;->d:Lblp;

    .line 97
    return-void
.end method

.method static synthetic a(Lbjh;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lbjh;->af:Landroid/os/Handler;

    return-object v0
.end method

.method public static a(JII)Lbjh;
    .locals 4

    .prologue
    .line 101
    new-instance v0, Lbjh;

    invoke-direct {v0}, Lbjh;-><init>()V

    .line 102
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 103
    const-string v2, "pollDelay"

    invoke-virtual {v1, v2, p0, p1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 104
    const-string v2, "percentDoneThreshold"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 105
    const-string v2, "numErrorsAllowed"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 106
    invoke-virtual {v0, v1}, Lbjh;->f(Landroid/os/Bundle;)V

    .line 107
    return-object v0
.end method

.method private a(Z)V
    .locals 2

    .prologue
    .line 245
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lbjh;->Z:Lapd;

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 246
    if-eqz p1, :cond_0

    .line 247
    iget-object v0, p0, Lbjh;->aa:Lbjk;

    invoke-interface {v0}, Lbjk;->j()V

    .line 251
    :goto_0
    return-void

    .line 249
    :cond_0
    iget-object v0, p0, Lbjh;->aa:Lbjk;

    invoke-interface {v0}, Lbjk;->i()V

    goto :goto_0
.end method

.method static synthetic b(Lbjh;)Lbjk;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lbjh;->aa:Lbjk;

    return-object v0
.end method

.method private b(I)V
    .locals 1

    .prologue
    .line 168
    iput p1, p0, Lbjh;->ab:I

    .line 169
    iget-object v0, p0, Lbjh;->aa:Lbjk;

    invoke-interface {v0, p1}, Lbjk;->b(I)V

    .line 170
    return-void
.end method

.method static synthetic c(Lbjh;)Lblp;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lbjh;->d:Lblp;

    return-object v0
.end method

.method private p()Z
    .locals 2

    .prologue
    .line 236
    iget v0, p0, Lbjh;->ad:I

    iget v1, p0, Lbjh;->c:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 118
    invoke-super {p0}, Lj;->a()V

    .line 119
    const/4 v0, 0x0

    iput-object v0, p0, Lbjh;->aa:Lbjk;

    .line 120
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 112
    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    .line 113
    check-cast p1, Lbjk;

    iput-object p1, p0, Lbjh;->aa:Lbjk;

    .line 114
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 124
    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    .line 126
    new-instance v0, Lapd;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Lapd;-><init>(I)V

    iput-object v0, p0, Lbjh;->Z:Lapd;

    .line 1559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 129
    const-string v1, "pollDelay"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lbjh;->a:J

    .line 130
    const-string v1, "percentDoneThreshold"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lbjh;->b:I

    .line 131
    const-string v1, "numErrorsAllowed"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lbjh;->c:I

    .line 133
    if-eqz p1, :cond_0

    .line 134
    const-string v0, "otaReadyToApply"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lbjh;->ac:Z

    .line 135
    const-string v0, "otaPercent"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, v0}, Lbjh;->b(I)V

    .line 136
    const-string v0, "errorCount"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lbjh;->ad:I

    .line 138
    :cond_0
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 21
    check-cast p1, Lbdf;

    .line 2174
    iget-object v0, p0, Lbjh;->af:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2628
    iget-object v0, p1, Lbdf;->G:Lbdj;

    .line 2180
    sget-object v1, Lbjj;->a:[I

    invoke-virtual {v0}, Lbdj;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 2200
    new-array v1, v4, [Ljava/lang/Object;

    iget v0, v0, Lbdj;->r:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v1, v3

    .line 2201
    iget-object v0, p0, Lbjh;->aa:Lbjk;

    invoke-interface {v0}, Lbjk;->k()V

    .line 2197
    :cond_0
    :goto_0
    return-void

    .line 2184
    :pswitch_0
    iput v3, p0, Lbjh;->ad:I

    .line 3407
    iget-boolean v0, p1, Lbdf;->s:Z

    .line 2185
    iput-boolean v0, p0, Lbjh;->ac:Z

    .line 3415
    iget v0, p1, Lbdf;->t:I

    .line 2186
    invoke-direct {p0, v0}, Lbjh;->b(I)V

    .line 2187
    invoke-direct {p0}, Lbjh;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2188
    iput-boolean v3, p0, Lbjh;->ae:Z

    .line 2189
    iget-object v0, p0, Lbjh;->af:Landroid/os/Handler;

    iget-object v1, p0, Lbjh;->ag:Ljava/lang/Runnable;

    iget-wide v2, p0, Lbjh;->a:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 2191
    :cond_1
    invoke-direct {p0, v3}, Lbjh;->a(Z)V

    goto :goto_0

    .line 2196
    :pswitch_1
    invoke-direct {p0, v4}, Lbjh;->a(Z)V

    goto :goto_0

    .line 2180
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final b_(I)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 207
    iget-object v0, p0, Lbjh;->af:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/16 v0, -0x63

    if-ne p1, v0, :cond_1

    .line 231
    :cond_0
    :goto_0
    return-void

    .line 213
    :cond_1
    iget-boolean v0, p0, Lbjh;->ac:Z

    if-nez v0, :cond_2

    iget v0, p0, Lbjh;->ab:I

    iget v1, p0, Lbjh;->b:I

    if-lt v0, v1, :cond_3

    .line 214
    :cond_2
    invoke-direct {p0, v2}, Lbjh;->a(Z)V

    goto :goto_0

    .line 215
    :cond_3
    iget-boolean v0, p0, Lbjh;->ae:Z

    if-eqz v0, :cond_5

    iget v0, p0, Lbjh;->ab:I

    if-lez v0, :cond_5

    const/4 v0, -0x1

    if-eq p1, v0, :cond_4

    const/4 v0, -0x2

    if-ne p1, v0, :cond_5

    .line 220
    :cond_4
    new-array v0, v3, [Ljava/lang/Object;

    .line 221
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    .line 222
    invoke-direct {p0, v2}, Lbjh;->a(Z)V

    goto :goto_0

    .line 223
    :cond_5
    iget v0, p0, Lbjh;->ad:I

    iget v1, p0, Lbjh;->c:I

    if-ge v0, v1, :cond_6

    .line 224
    iget v0, p0, Lbjh;->ad:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lbjh;->ad:I

    .line 225
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    iget v1, p0, Lbjh;->ad:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v3

    .line 226
    iget-object v0, p0, Lbjh;->af:Landroid/os/Handler;

    iget-object v1, p0, Lbjh;->ag:Ljava/lang/Runnable;

    iget-wide v2, p0, Lbjh;->a:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 228
    :cond_6
    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    .line 229
    iget-object v0, p0, Lbjh;->aa:Lbjk;

    invoke-interface {v0}, Lbjk;->k()V

    goto :goto_0
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 161
    invoke-super {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    .line 162
    const-string v0, "otaPercent"

    iget v1, p0, Lbjh;->ab:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 163
    const-string v0, "otaReadyToApply"

    iget-boolean v1, p0, Lbjh;->ac:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 164
    const-string v0, "errorCount"

    iget v1, p0, Lbjh;->ad:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 165
    return-void
.end method

.method public final g_()V
    .locals 1

    .prologue
    .line 142
    invoke-super {p0}, Lj;->g_()V

    .line 144
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lbjh;->af:Landroid/os/Handler;

    .line 145
    invoke-direct {p0}, Lbjh;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    const/4 v0, 0x1

    iput-boolean v0, p0, Lbjh;->ae:Z

    .line 148
    iget-object v0, p0, Lbjh;->ag:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 150
    :cond_0
    return-void
.end method

.method public final h_()V
    .locals 2

    .prologue
    .line 154
    invoke-super {p0}, Lj;->h_()V

    .line 155
    iget-object v0, p0, Lbjh;->af:Landroid/os/Handler;

    iget-object v1, p0, Lbjh;->ag:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 156
    const/4 v0, 0x0

    iput-object v0, p0, Lbjh;->af:Landroid/os/Handler;

    .line 157
    return-void
.end method
