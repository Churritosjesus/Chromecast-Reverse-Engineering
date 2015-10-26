.class public final Lbke;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public final d:Ljava/util/ArrayList;

.field e:[Ldal;

.field public f:Ljava/util/HashSet;

.field private final g:J

.field private h:Lapj;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-boolean v0, p0, Lbke;->b:Z

    .line 57
    iput-boolean v0, p0, Lbke;->a:Z

    .line 58
    iput-boolean v0, p0, Lbke;->c:Z

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbke;->d:Ljava/util/ArrayList;

    .line 61
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 60
    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 62
    const-string v1, "IGNORED_ANNOUNCEMENT_CARDS"

    const-string v2, ""

    .line 63
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    .line 62
    invoke-static {v0, v1}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 65
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lbke;->f:Ljava/util/HashSet;

    .line 66
    iget-object v1, p0, Lbke;->f:Ljava/util/HashSet;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    .line 67
    new-instance v0, Lapj;

    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    invoke-direct {v0, v1}, Lapj;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lbke;->h:Lapj;

    .line 68
    invoke-static {}, Lbke;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lbke;->g:J

    .line 69
    return-void
.end method

.method private static c()J
    .locals 8

    .prologue
    const-wide/16 v0, 0x0

    .line 77
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/apps/chromecast/app/SetupApplication;->e()Ljava/lang/String;

    move-result-object v2

    .line 79
    const-string v3, "\\."

    invoke-static {v2, v3}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 80
    array-length v3, v2

    const/4 v4, 0x2

    if-ge v3, v4, :cond_0

    .line 87
    :goto_0
    return-wide v0

    .line 84
    :cond_0
    const/4 v3, 0x0

    :try_start_0
    aget-object v3, v2, v3

    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    add-long/2addr v0, v4

    goto :goto_0

    .line 87
    :catch_0
    move-exception v2

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 122
    iget-object v0, p0, Lbke;->e:[Ldal;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbke;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 123
    invoke-virtual {p0}, Lbke;->b()Ldal;

    move-result-object v1

    .line 124
    iget-object v0, p0, Lbke;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbkf;

    .line 125
    invoke-interface {v0, v1}, Lbkf;->a(Ldal;)V

    goto :goto_0

    .line 128
    :cond_0
    return-void
.end method

.method public final b()Ldal;
    .locals 10

    .prologue
    const/4 v0, 0x0

    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 133
    iget-object v1, p0, Lbke;->e:[Ldal;

    if-nez v1, :cond_1

    .line 143
    :cond_0
    return-object v0

    :cond_1
    move v1, v2

    .line 137
    :goto_0
    iget-object v3, p0, Lbke;->e:[Ldal;

    array-length v3, v3

    if-ge v1, v3, :cond_0

    .line 138
    iget-object v3, p0, Lbke;->e:[Ldal;

    aget-object v5, v3, v1

    .line 1178
    iget-object v6, v5, Ldal;->c:[I

    array-length v7, v6

    move v3, v2

    :goto_1
    if-ge v3, v7, :cond_9

    aget v8, v6, v3

    .line 1179
    if-nez v8, :cond_8

    move v3, v4

    .line 1147
    :goto_2
    if-eqz v3, :cond_d

    .line 1151
    iget-object v3, v5, Ldal;->l:Ljava/lang/Long;

    if-eqz v3, :cond_2

    iget-wide v6, p0, Lbke;->g:J

    iget-object v3, v5, Ldal;->l:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    cmp-long v3, v6, v8

    if-ltz v3, :cond_d

    .line 1155
    :cond_2
    iget-boolean v3, p0, Lbke;->b:Z

    if-nez v3, :cond_3

    iget v3, v5, Ldal;->b:I

    const/4 v6, 0x3

    if-eq v3, v6, :cond_d

    .line 1160
    :cond_3
    iget-boolean v3, p0, Lbke;->a:Z

    if-nez v3, :cond_4

    iget v3, v5, Ldal;->b:I

    const/4 v6, 0x2

    if-eq v3, v6, :cond_d

    .line 1165
    :cond_4
    iget-boolean v3, p0, Lbke;->c:Z

    if-nez v3, :cond_5

    iget v3, v5, Ldal;->b:I

    if-eq v3, v4, :cond_d

    .line 1170
    :cond_5
    iget-object v3, p0, Lbke;->h:Lapj;

    .line 2046
    iget-object v6, v5, Ldal;->a:Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    const-wide/16 v8, 0x5

    cmp-long v6, v6, v8

    if-nez v6, :cond_a

    .line 2047
    iget-boolean v3, v3, Lapj;->a:Z

    .line 1170
    :goto_3
    if-nez v3, :cond_d

    .line 1174
    iget-object v3, p0, Lbke;->f:Ljava/util/HashSet;

    iget-object v5, v5, Ldal;->a:Ljava/lang/Long;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    move v3, v4

    .line 138
    :goto_4
    if-eqz v3, :cond_7

    if-eqz v0, :cond_6

    iget-object v3, p0, Lbke;->e:[Ldal;

    aget-object v3, v3, v1

    iget-object v3, v3, Ldal;->d:Ljava/lang/Long;

    .line 139
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v3, v0, Ldal;->d:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    cmp-long v3, v6, v8

    if-gez v3, :cond_7

    .line 140
    :cond_6
    iget-object v0, p0, Lbke;->e:[Ldal;

    aget-object v0, v0, v1

    .line 137
    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1178
    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_9
    move v3, v2

    .line 1184
    goto :goto_2

    .line 2048
    :cond_a
    iget-object v6, v5, Ldal;->a:Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    const-wide/16 v8, 0x1

    cmp-long v6, v6, v8

    if-nez v6, :cond_b

    .line 2049
    iget-boolean v3, v3, Lapj;->b:Z

    goto :goto_3

    .line 2050
    :cond_b
    iget-object v6, v5, Ldal;->a:Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    const-wide/16 v8, 0x3

    cmp-long v6, v6, v8

    if-nez v6, :cond_c

    .line 2051
    iget-boolean v3, v3, Lapj;->c:Z

    goto :goto_3

    :cond_c
    move v3, v2

    .line 2054
    goto :goto_3

    :cond_d
    move v3, v2

    .line 1174
    goto :goto_4
.end method
