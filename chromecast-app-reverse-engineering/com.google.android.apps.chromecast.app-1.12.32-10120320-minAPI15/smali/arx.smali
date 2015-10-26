.class final Larx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Larv;


# direct methods
.method constructor <init>(Larv;)V
    .locals 0

    .prologue
    .line 253
    iput-object p1, p0, Larx;->a:Larv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 256
    iget-object v0, p0, Larx;->a:Larv;

    iget-object v0, v0, Larv;->b:Lart;

    invoke-static {v0}, Lart;->a(Lart;)Laqw;

    move-result-object v0

    iget-object v1, p0, Larx;->a:Larv;

    iget-object v1, v1, Larv;->a:Ldcj;

    iget-object v1, v1, Ldcj;->j:Ljava/lang/String;

    invoke-interface {v0, v1}, Laqw;->d(Ljava/lang/String;)V

    .line 257
    return-void
.end method
