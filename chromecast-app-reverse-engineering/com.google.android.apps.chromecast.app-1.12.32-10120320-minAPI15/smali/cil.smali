.class public final Lcil;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcio;

.field private static final b:Lcin;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcio;

    invoke-direct {v0}, Lcio;-><init>()V

    sput-object v0, Lcil;->a:Lcio;

    new-instance v0, Lcin;

    sget-object v1, Lcil;->a:Lcio;

    invoke-direct {v0, v1}, Lcin;-><init>(Lcio;)V

    sput-object v0, Lcil;->b:Lcin;

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;Lcom/google/android/gms/identity/accounts/api/AccountData;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 0
    sget-object v2, Lcil;->b:Lcin;

    .line 1000
    const-string v1, "Context must not be null."

    invoke-static {p0, v1}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Intent must not be null."

    invoke-static {p1, v1}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Account data must not be null."

    invoke-static {p2, v1}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2000
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 1000
    :goto_0
    if-eqz v1, :cond_0

    iget-object v2, v2, Lcin;->a:Lcio;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lcio;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3000
    const-string v1, "com.google.android.gms.accounts.ACCOUNT_DATA"

    .line 5000
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2

    invoke-interface {p2, v2, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;->writeToParcel(Landroid/os/Parcel;I)V

    invoke-virtual {v2}, Landroid/os/Parcel;->marshall()[B

    move-result-object v0

    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 4000
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 3000
    const/4 v0, 0x1

    .line 1000
    :cond_0
    return v0

    .line 2000
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method
