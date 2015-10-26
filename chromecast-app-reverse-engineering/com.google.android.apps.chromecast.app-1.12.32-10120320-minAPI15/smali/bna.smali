.class final Lbna;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Ljava/lang/Long;


# direct methods
.method constructor <init>(Lbmu;Ljava/lang/Long;)V
    .locals 0

    .prologue
    .line 1030
    iput-object p2, p0, Lbna;->a:Ljava/lang/Long;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    .line 1033
    invoke-static {}, Lbkh;->a()Lbkh;

    move-result-object v0

    .line 1067
    iget-object v0, v0, Lbkh;->g:Lbke;

    .line 1034
    iget-object v1, p0, Lbna;->a:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 1188
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    .line 1189
    iget-object v4, v0, Lbke;->f:Ljava/util/HashSet;

    invoke-virtual {v4, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1191
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 1192
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v4, "IGNORED_ANNOUNCEMENT_CARDS"

    const-string v5, ","

    iget-object v6, v0, Lbke;->f:Ljava/util/HashSet;

    .line 1195
    invoke-virtual {v6}, Ljava/util/HashSet;->toArray()[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1193
    invoke-interface {v1, v4, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 1196
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1197
    iget-object v0, v0, Lbke;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbkf;

    .line 1198
    invoke-interface {v0, v2, v3}, Lbkf;->a(J)V

    goto :goto_0

    .line 1035
    :cond_0
    return-void
.end method
