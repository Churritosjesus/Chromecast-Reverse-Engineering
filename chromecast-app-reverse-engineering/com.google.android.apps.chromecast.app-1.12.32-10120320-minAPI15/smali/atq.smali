.class final Latq;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:Latf;


# direct methods
.method constructor <init>(Latf;)V
    .locals 0

    .prologue
    .line 558
    iput-object p1, p0, Latq;->a:Latf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 558
    check-cast p1, Ldaz;

    .line 1561
    iget-object v0, p0, Latq;->a:Latf;

    .line 2066
    iput-object p1, v0, Latf;->g:Ldaz;

    .line 1562
    iget-object v0, p1, Ldaz;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1563
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    iget-object v1, p1, Ldaz;->e:Ljava/lang/String;

    .line 2342
    iput-object v1, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->c:Ljava/lang/String;

    .line 1565
    :cond_0
    iget-object v0, p0, Latq;->a:Latf;

    .line 3066
    iget-object v0, v0, Latf;->a:Landroid/content/Context;

    .line 1566
    invoke-static {v0, p1}, Lblx;->a(Landroid/content/Context;Ldaz;)Ljava/util/Set;

    move-result-object v3

    .line 1567
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    .line 1568
    invoke-interface {v3, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1569
    iget-object v1, p0, Latq;->a:Latf;

    invoke-static {v0}, Lblx;->a([Ljava/lang/String;)Ldax;

    move-result-object v0

    .line 4066
    iput-object v0, v1, Latf;->f:Ldax;

    .line 1570
    iget-object v0, p0, Latq;->a:Latf;

    .line 5066
    invoke-virtual {v0}, Latf;->b()V

    .line 1574
    iget-object v4, p1, Ldaz;->d:[Ljava/lang/String;

    array-length v5, v4

    move v1, v2

    move v0, v2

    :goto_0
    if-ge v1, v5, :cond_2

    aget-object v6, v4, v1

    .line 1575
    invoke-interface {v3, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 1576
    const/4 v0, 0x1

    .line 1574
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1579
    :cond_2
    iget-object v1, p0, Latq;->a:Latf;

    .line 6066
    iget-object v1, v1, Latf;->a:Landroid/content/Context;

    .line 1579
    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v3, "content_search_enabled"

    iget-object v4, p1, Ldaz;->a:Ljava/lang/Boolean;

    .line 1580
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v3, "content_whatson_enabled"

    iget-object v4, p1, Ldaz;->b:Ljava/lang/Boolean;

    .line 1581
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v3, "content_getapps_enabled"

    iget-object v4, p1, Ldaz;->c:Ljava/lang/Boolean;

    .line 1582
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v3, "content_default_getapps"

    .line 1583
    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1584
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1586
    :goto_1
    iget-object v0, p0, Latq;->a:Latf;

    .line 7066
    iget-object v0, v0, Latf;->i:Ljava/util/List;

    .line 1586
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1587
    iget-object v0, p0, Latq;->a:Latf;

    .line 8066
    iget-object v0, v0, Latf;->i:Ljava/util/List;

    .line 1587
    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Latr;

    iget-object v1, p0, Latq;->a:Latf;

    .line 9066
    iget-object v1, v1, Latf;->f:Ldax;

    .line 1587
    invoke-interface {v0, v1}, Latr;->a(Ldax;)V

    goto :goto_1

    .line 1589
    :cond_3
    iget-object v0, p0, Latq;->a:Latf;

    .line 10066
    iget-object v0, v0, Latf;->j:Ljava/util/List;

    .line 1589
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1590
    iget-object v0, p0, Latq;->a:Latf;

    .line 11066
    iput-boolean v2, v0, Latf;->h:Z

    .line 558
    return-void
.end method
