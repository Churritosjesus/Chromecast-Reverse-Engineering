.class final Lajr;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field private synthetic a:Lajq;


# direct methods
.method constructor <init>(Lajq;)V
    .locals 0

    .prologue
    .line 223
    iput-object p1, p0, Lajr;->a:Lajq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Lajr;->a:Lajq;

    invoke-virtual {v0}, Lajq;->cancel()V

    .line 227
    return-void
.end method
