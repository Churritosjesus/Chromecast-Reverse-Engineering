.class final Laqz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Laqy;


# direct methods
.method constructor <init>(Laqy;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Laqz;->a:Laqy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Laqz;->a:Laqy;

    invoke-static {v0}, Laqy;->a(Laqy;)Larc;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Laqz;->a:Laqy;

    invoke-static {v0}, Laqy;->a(Laqy;)Larc;

    move-result-object v0

    invoke-interface {v0}, Larc;->o()V

    .line 46
    :cond_0
    return-void
.end method
