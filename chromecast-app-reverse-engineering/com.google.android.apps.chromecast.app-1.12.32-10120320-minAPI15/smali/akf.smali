.class final Lakf;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 186
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 186
    .line 2190
    new-instance v0, Lake;

    invoke-direct {v0, p1}, Lake;-><init>(Landroid/os/Parcel;)V

    .line 186
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 186
    .line 1195
    new-array v0, p1, [Lake;

    .line 186
    return-object v0
.end method
