.class final Laxf;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field private synthetic a:Laxd;


# direct methods
.method constructor <init>(Laxd;)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Laxf;->a:Laxd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 101
    const-string v0, "hendrixDiscovered"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "nonhendrixDiscovered"

    .line 102
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "manualAudio"

    .line 103
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1029
    :cond_0
    invoke-static {p1}, Laxd;->a(Landroid/content/SharedPreferences;)Z

    move-result v0

    .line 105
    iget-object v1, p0, Laxf;->a:Laxd;

    .line 2029
    iget-boolean v1, v1, Laxd;->i:Z

    .line 105
    if-eq v1, v0, :cond_1

    .line 107
    iget-object v1, p0, Laxf;->a:Laxd;

    .line 3029
    iput-boolean v0, v1, Laxd;->i:Z

    .line 108
    iget-object v0, p0, Laxf;->a:Laxd;

    invoke-virtual {v0}, Laxd;->a()V

    .line 109
    iget-object v0, p0, Laxf;->a:Laxd;

    invoke-virtual {v0}, Laxd;->b()V

    .line 112
    :cond_1
    return-void
.end method
