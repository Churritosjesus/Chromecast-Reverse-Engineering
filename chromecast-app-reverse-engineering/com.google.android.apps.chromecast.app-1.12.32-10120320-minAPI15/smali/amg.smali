.class final Lamg;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Lama;


# direct methods
.method constructor <init>(Lama;)V
    .locals 0

    .prologue
    .line 568
    iput-object p1, p0, Lamg;->a:Lama;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 571
    iget-object v0, p0, Lamg;->a:Lama;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lama;->a(Landroid/content/Intent;I)V

    .line 573
    return-void
.end method
