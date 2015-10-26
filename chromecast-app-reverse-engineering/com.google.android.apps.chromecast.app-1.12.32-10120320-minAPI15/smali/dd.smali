.class final Ldd;
.super Ldc;
.source "PG"


# instance fields
.field private final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1244
    invoke-direct {p0}, Ldc;-><init>()V

    .line 1245
    iput-object p1, p0, Ldd;->a:Ljava/lang/Object;

    .line 1246
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 1250
    iget-object v0, p0, Ldd;->a:Ljava/lang/Object;

    .line 2123
    check-cast v0, Landroid/media/session/MediaController$TransportControls;

    invoke-virtual {v0}, Landroid/media/session/MediaController$TransportControls;->play()V

    .line 1251
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 1255
    iget-object v0, p0, Ldd;->a:Ljava/lang/Object;

    .line 2127
    check-cast v0, Landroid/media/session/MediaController$TransportControls;

    invoke-virtual {v0}, Landroid/media/session/MediaController$TransportControls;->pause()V

    .line 1256
    return-void
.end method
