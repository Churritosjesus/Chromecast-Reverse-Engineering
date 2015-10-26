.class final Lapx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Lapu;


# direct methods
.method constructor <init>(Lapu;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lapx;->a:Lapu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lapx;->a:Lapu;

    invoke-static {v0}, Lapu;->a(Lapu;)V

    .line 165
    return-void
.end method
