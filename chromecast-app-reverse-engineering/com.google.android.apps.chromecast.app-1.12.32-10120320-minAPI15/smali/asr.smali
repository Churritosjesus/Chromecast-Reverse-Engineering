.class public final Lasr;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 40
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x5

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lasr;->a:J

    return-void
.end method

.method public static a(Landroid/content/Context;)Laec;
    .locals 4

    .prologue
    .line 112
    new-instance v0, Laec;

    .line 113
    invoke-static {p0}, Lblf;->X(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3}, Laec;-><init>(IIF)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;)Landroid/content/Intent;
    .locals 5

    .prologue
    .line 66
    new-instance v1, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 67
    const/high16 v0, 0x10000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 68
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 1396
    iget-object v2, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->e:Ljava/lang/String;

    .line 70
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 72
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 73
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 74
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 75
    const-string v4, "com.google.android.apps.plus"

    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 76
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 77
    invoke-static {v2}, Lcom/google/android/gms/identity/accounts/api/AccountData;->a(Ljava/lang/String;)Lcom/google/android/gms/identity/accounts/api/AccountData;

    move-result-object v0

    .line 79
    invoke-static {p1, v1, v0}, Lcil;->a(Landroid/content/Context;Landroid/content/Intent;Lcom/google/android/gms/identity/accounts/api/AccountData;)Z

    .line 85
    :cond_1
    return-object v1
.end method

.method public static a(Landroid/view/MenuItem;Landroid/widget/CompoundButton$OnCheckedChangeListener;Ljava/lang/Boolean;)Landroid/support/v7/widget/SwitchCompat;
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 53
    invoke-interface {p0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/SwitchCompat;

    .line 54
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-ne p2, v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    .line 55
    invoke-virtual {v0}, Landroid/support/v7/widget/SwitchCompat;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v3, La;->dy:I

    .line 56
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 55
    invoke-virtual {v0, v2, v2, v1, v2}, Landroid/support/v7/widget/SwitchCompat;->setPadding(IIII)V

    .line 57
    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SwitchCompat;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 58
    return-object v0

    :cond_0
    move v1, v2

    .line 54
    goto :goto_0
.end method

.method public static a(Laow;)Ldbt;
    .locals 3

    .prologue
    .line 142
    .line 1474
    iget-object v0, p0, Laow;->j:Ljava/lang/String;

    .line 142
    invoke-virtual {p0}, Laow;->g()Ljava/lang/String;

    move-result-object v1

    .line 1479
    iget-object v2, p0, Laow;->k:Ljava/lang/String;

    .line 142
    invoke-static {v0, v1, v2}, Lasr;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ldbt;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ldbr;Ljava/lang/String;)Ldbt;
    .locals 2

    .prologue
    .line 148
    iget-object v0, p0, Ldbr;->b:Ljava/lang/String;

    iget-object v1, p0, Ldbr;->c:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lasr;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ldbt;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ldbt;
    .locals 2

    .prologue
    .line 130
    new-instance v0, Ldbt;

    invoke-direct {v0}, Ldbt;-><init>()V

    .line 131
    iput-object p0, v0, Ldbt;->a:Ljava/lang/String;

    .line 132
    iput-object p1, v0, Ldbt;->b:Ljava/lang/String;

    .line 134
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 135
    iput-object p2, v0, Ldbt;->c:Ljava/lang/String;

    .line 138
    :cond_0
    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 103
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method
