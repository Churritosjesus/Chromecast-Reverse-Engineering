.class final Lazs;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Ljava/net/MulticastSocket;

.field private synthetic b:Lazm;


# direct methods
.method public constructor <init>(Lazm;Ljava/net/MulticastSocket;)V
    .locals 0

    .prologue
    .line 626
    iput-object p1, p0, Lazs;->b:Lazm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 627
    iput-object p2, p0, Lazs;->a:Ljava/net/MulticastSocket;

    .line 628
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 632
    iget-object v0, p0, Lazs;->b:Lazm;

    iget-object v1, p0, Lazs;->a:Ljava/net/MulticastSocket;

    invoke-static {v0, v1}, Lazm;->a(Lazm;Ljava/net/MulticastSocket;)V

    .line 633
    return-void
.end method
