.class final Lbmb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 517
    iput-object p1, p0, Lbmb;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 520
    iget-object v0, p0, Lbmb;->a:Landroid/app/Activity;

    invoke-static {v0}, Lblx;->e(Landroid/app/Activity;)V

    .line 521
    return-void
.end method
