.class final Lapv;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field private synthetic a:Lapu;


# direct methods
.method constructor <init>(Lapu;)V
    .locals 0

    .prologue
    .line 175
    iput-object p1, p0, Lapv;->a:Lapu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 178
    iget-object v0, p0, Lapv;->a:Lapu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lapu;->a(Lapu;Ljava/lang/String;)V

    .line 179
    return-void
.end method
