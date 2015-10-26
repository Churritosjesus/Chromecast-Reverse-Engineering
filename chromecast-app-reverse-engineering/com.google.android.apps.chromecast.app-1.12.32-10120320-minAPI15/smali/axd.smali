.class public final Laxd;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Landroid/content/Context;

.field final b:Latf;

.field public c:Ldat;

.field public d:Ldat;

.field public e:[I

.field public final f:Lblp;

.field g:Laxn;

.field public h:Laxn;

.field i:Z

.field j:Laef;

.field public k:Laef;

.field public l:J

.field m:J

.field public n:Z

.field public final o:Landroid/os/Handler;

.field public final p:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Latf;)V
    .locals 2

    .prologue
    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    new-instance v0, Lblp;

    const-string v1, "ContentDiscoveryManager"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Laxd;->f:Lblp;

    .line 75
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Laxd;->o:Landroid/os/Handler;

    .line 76
    new-instance v0, Laxe;

    invoke-direct {v0, p0}, Laxe;-><init>(Laxd;)V

    iput-object v0, p0, Laxd;->p:Ljava/lang/Runnable;

    .line 92
    iput-object p1, p0, Laxd;->a:Landroid/content/Context;

    .line 93
    iput-object p2, p0, Laxd;->b:Latf;

    .line 94
    invoke-static {p1}, Lblf;->w(Landroid/content/Context;)J

    move-result-wide v0

    iput-wide v0, p0, Laxd;->m:J

    .line 95
    iget-object v0, p0, Laxd;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {v0}, Laxd;->a(Landroid/content/SharedPreferences;)Z

    move-result v0

    iput-boolean v0, p0, Laxd;->i:Z

    .line 97
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    new-instance v1, Laxf;

    invoke-direct {v1, p0}, Laxf;-><init>(Laxd;)V

    .line 98
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 114
    return-void
.end method

.method static synthetic a(Laxd;)V
    .locals 4

    .prologue
    .line 29
    .line 1272
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Laxd;->l:J

    .line 1273
    iget-object v0, p0, Laxd;->o:Landroid/os/Handler;

    iget-object v1, p0, Laxd;->p:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1274
    iget-object v0, p0, Laxd;->o:Landroid/os/Handler;

    iget-object v1, p0, Laxd;->p:Ljava/lang/Runnable;

    iget-wide v2, p0, Laxd;->m:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 29
    return-void
.end method

.method static a(Landroid/content/SharedPreferences;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 278
    const-string v1, "manualAudio"

    invoke-interface {p0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 279
    const-string v1, "manualAudio"

    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 282
    :cond_0
    :goto_0
    return v0

    .line 281
    :cond_1
    const-string v1, "hendrixDiscovered"

    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "nonhendrixDiscovered"

    .line 282
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 185
    const/4 v0, 0x0

    iput-object v0, p0, Laxd;->j:Laef;

    .line 186
    new-instance v0, Laxg;

    invoke-direct {v0, p0}, Laxg;-><init>(Laxd;)V

    .line 196
    iget-object v1, p0, Laxd;->b:Latf;

    new-instance v2, Laxh;

    invoke-direct {v2, p0, v0}, Laxh;-><init>(Laxd;Ladz;)V

    invoke-virtual {v1, v2, v0}, Latf;->a(Latr;Ladz;)V

    .line 221
    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    .line 224
    const/4 v0, 0x0

    iput-object v0, p0, Laxd;->k:Laef;

    .line 225
    new-instance v0, Laxj;

    invoke-direct {v0, p0}, Laxj;-><init>(Laxd;)V

    .line 235
    iget-object v1, p0, Laxd;->b:Latf;

    new-instance v2, Laxk;

    invoke-direct {v2, p0, v0}, Laxk;-><init>(Laxd;Ladz;)V

    invoke-virtual {v1, v2, v0}, Latf;->a(Latr;Ladz;)V

    .line 257
    return-void
.end method
